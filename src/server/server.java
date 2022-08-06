package server;

import java.io.IOException;
import java.net.ServerSocket;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9445);
            System.out.println("Server started");
            serverSocket.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
