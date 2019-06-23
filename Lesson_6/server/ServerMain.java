package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class ServerMain {
    private Vector<ClientHandler> clients;

    public ServerMain () {
        ServerSocket server = null;
        Socket socket = null;
        clients = new Vector<>();

        try {

            server = new ServerSocket(8189);
            System.out.println("Server start. Wait...");

            while(true){
                socket = server.accept();
                clients.add( new ClientHandler(socket, this));
                System.out.println("Client connected...");
                broadcastMsg("Client connected");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void broadcastMsg(String msg){
        for (ClientHandler o: clients) {
            o.sendMsg(msg);
        }
    }
}