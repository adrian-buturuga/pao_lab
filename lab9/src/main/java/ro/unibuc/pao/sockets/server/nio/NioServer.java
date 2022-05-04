package ro.unibuc.pao.sockets.server.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class NioServer {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel socket = ServerSocketChannel.open();
        InetSocketAddress bindAddress = new InetSocketAddress("localhost", 42001);
        socket.bind(bindAddress);
        socket.configureBlocking(false);
        socket.register(selector, socket.validOps(), null);
        System.out.println("Started...");

        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            for (SelectionKey key : keys) {
                if (key.isAcceptable()) {
                    SocketChannel client = socket.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("Client connected");
                } else if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer messageBuffer = ByteBuffer.allocate(1000);
                    client.read(messageBuffer);
                    String message = new String(messageBuffer.array()).trim();
                    System.out.println("Received: " + message);
                    ByteBuffer responseBuffer = ByteBuffer.wrap("ACK\n".getBytes());
                    client.write(responseBuffer);
                    if (message.equalsIgnoreCase("exit")) {
                        System.out.println("Closing client");
                        client.close();
                        socket.close();
                        selector.close();
                        System.exit(0);
                    }
                }
                keys.remove(key);
            }
        }
    }
}
