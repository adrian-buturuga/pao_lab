package ro.unibuc.pao.sockets.server.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientHandler extends Thread {

    private Socket client;
    private BufferedReader input;

    public ClientHandler(Socket client) throws IOException {
        this.client = client;
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
    }

    @Override
    public void run() {
        boolean closed = false;
        try {
            while (!closed) {
                String messageFromClient = input.readLine();
                System.out.println("Message from client: " + messageFromClient);

                client.getOutputStream().write("ACK\n".getBytes());

                if (messageFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Closing...");
                    disconnect();
                    closed = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Could not connect / send messages. Reason: " + e.getMessage());
        }
    }

    private void disconnect() throws IOException {
        client.close();
    }

}
