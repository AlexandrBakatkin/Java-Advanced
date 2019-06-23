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
                            String str = null;
                            try {
                                str = in.readUTF();
                                System.out.println(str);
                                if (str.equals("/end")) {
                                    sendMsg("Вы отключены от сервера");
                                    break;
                                }
                                server.broadcastMsg("Client: " + str);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
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

    public void sendMsg(String str){
        try {
            out.writeUTF(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}