package ro.unibuc.pao.sockets.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader confirmations;

    public void connect(String host, int port) throws IOException {
        socket = new Socket(host, port);
        confirmations = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Connected");
    }

    public void sendMessage(String message) throws IOException {
        System.out.println("-> " + message);
        socket.getOutputStream().write((message + "\n").getBytes());
        System.out.println("<- " + confirmations.readLine());
    }

    public void disconnect() throws IOException {
        sendMessage("exit");
        socket.close();
        confirmations.close();
        System.exit(0);
    }

}
