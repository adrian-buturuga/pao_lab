package ro.unibuc.pao.sockets.client;

import java.io.IOException;

public class ClientMain {

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.connect("localhost", 42000);
        client.sendMessage("Some message");
        client.disconnect();
    }
}
