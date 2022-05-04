package ro.unibuc.pao.sockets.server.simple;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        new Server().start(42000);
    }

}
