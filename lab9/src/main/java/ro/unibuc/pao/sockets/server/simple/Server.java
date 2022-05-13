package ro.unibuc.pao.sockets.server.simple;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private ServerSocket serverSocket;
    private Socket client;
    private int connectionLimit = 3;
    private ExecutorService executorService = Executors.newFixedThreadPool(connectionLimit);

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started...");

        while (true) {
            client = serverSocket.accept();
            System.out.println("Client connected!");

            executorService.submit(new ClientHandler(client));
        }
    }

}
