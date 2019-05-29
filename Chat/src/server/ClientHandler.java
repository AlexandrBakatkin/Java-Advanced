package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;
    private ServerMain server;
    private String nick;

    public String getNick() {
        return nick;
    }

    public ClientHandler(Socket socket, ServerMain server) {

        try {
            this.socket = socket;
            this.server = server;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        sendMsg("Вы подключились к серверу");

                        while (true){
                            String str = in.readUTF();
                            if (str.startsWith("/auth")){
                                if (checkUser(str, server)) break;
                            }
                        }

                        while (true){
                            String str = in.readUTF();

                                if (str.equals("/end")) {
                                    sendMsg("/ServerClosed");
                                    logout();
                                    break;
                                }

                            if (str.startsWith("/w")){
                                String [] message = str.split(" ");
                                String temp = "/w " + nick + " ";
                                String prvtMsg = str.replaceFirst(temp, "");
                                sendPrvtMsg(message[1], prvtMsg);
                            } else {
                                server.broadcastMsg(nick + ": " + str);
                            }

                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkUser(String str, ServerMain server) {
        String [] token = str.split(" ");
        String newNick = AuthService.getNickByLoginAndPass(token[1], token [2]);

        if (newNick != null){

            if (server.isLoginFree(newNick)) {
                server.broadcastMsg(newNick + ": вошел в чат");
                sendMsg("/authok");
                nick = newNick;
                server.loginUser(ClientHandler.this);
                return true;
            } else {
                sendMsg("Логин уже занят");
                sendMsg("/ServerClosed");
            }

        } else {
            sendMsg("Логин/пароль неверные");
        }
        return false;
    }

    private void logout() {
        server.logoutUser(this);
    }

    public void sendMsg(String str){
        try {
            out.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendPrvtMsg(String nick, String str){
        if (server.findClient(nick)== null){
            sendMsg("Клиент с таким логином не найден");
            return;
        }

        server.findClient(nick).sendMsg("Сообщние от " + nick + ": " + str);
    }
}