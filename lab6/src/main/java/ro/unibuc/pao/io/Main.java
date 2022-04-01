package ro.unibuc.pao.io;

import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        GenericIO io = getBufferedReaderWriter();
        io.writeInt(4567);
        int i = io.readInt();
        System.out.println(i);
        io.close();
    }

    private static ReaderWriterIO getReaderWriter() throws IOException {
        return new ReaderWriterIO();
    }

    private static BufferedReaderWriterIO getBufferedReaderWriter() throws IOException {
        return new BufferedReaderWriterIO();
    }
}
