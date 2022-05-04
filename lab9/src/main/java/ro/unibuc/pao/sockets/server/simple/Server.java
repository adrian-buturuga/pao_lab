package ro.unibuc.pao.sockets.server.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private Socket client;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started...");
        client = serverSocket.accept();
        System.out.println("Client connected!");
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String messageFromClient = input.readLine();
        System.out.println("Message from client: " + messageFromClient);
        client.getOutputStream().write("ACK\n".getBytes());
        if (messageFromClient.equalsIgnoreCase("exit")) {
            System.out.println("Closing...");
            stop();
        }
    }

    public void stop() throws IOException {
        serverSocket.close();
        client.close();
    }

}
