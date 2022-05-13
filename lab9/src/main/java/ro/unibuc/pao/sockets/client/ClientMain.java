package ro.unibuc.pao.sockets.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ClientMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Client> clients = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    Client client = new Client(new Random().nextInt(2000));
                    clients.add(client);
                    client.connect("localhost", 42001);
                    client.sendMessage("Some message");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        while (!clients.isEmpty()) {
            Thread.sleep(1000);
            clients.get(0).disconnect();
            clients.remove(0);
        }
    }
}
