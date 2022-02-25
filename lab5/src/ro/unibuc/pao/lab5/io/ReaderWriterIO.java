package ro.unibuc.pao.lab5.io;

import java.io.*;

public class ReaderWriterIO implements GenericIO {

    private Reader reader;
    private Writer writer;
    /**
     * in order to keep track of whether the end of file was reached or not, we need to check the last read value.
     */
    private int lastRead;

    public ReaderWriterIO() throws IOException {
        /*
         * opening a FileWriter with just the file name will empty the file (any previous content will be deleted).
         * if content needs to be kept and the Writer should write at the end, the constructor with an extra parameter
         * (for whether or not to append at the end of the file) should be called: new FileWriter("<<filename>>", true);
         */
        writer = new FileWriter("lab5/src/ro/unibuc/pao/lab5/io/files/reader.txt");
        reader = new FileReader("lab5/src/ro/unibuc/pao/lab5/io/files/reader.txt");
    }

    /**
     * In order to properly check for the end of file, we will need to know what's the last read value, so this method
     * calls the read() method, but also stores the result.
     */
    private char readChar() throws IOException {
        return (char) (lastRead = reader.read());
    }

    /**
     * Reader class only reads one character at a time. Since we need an integer, we will need to read chars until a
     * non-numeric char is read or the end of the file is reached, convert those chars to a string and parsing that string
     * as an int.
     */
    @Override
    public int readInt() throws IOException {
        char charsRead[] = new char[30];
        int length = -1;
        char ch = readChar();
        while (!hasReachedEnd() && lastRead >= '0' && lastRead <= '9') {
            charsRead[++length] = ch;
            ch = readChar();
        }
        // since the rest of the char array is filled with 0es, we need to trim them before parsing
        return Integer.parseInt(new String(charsRead).trim());
    }

    /**
     * Writer class, even if the parameter for the write method is an int, only writes the least significant 16bits of
     * the int (because it casts it to a char). So, in order to write the int, we need to write it, one digit at a time.
     * In order to reverse the number (write the most significant digit first), a recursion is used for this.
     */
    @Override
    public void writeInt(int i) throws IOException {
        // recursive call, in order to display digits in the correct order
        if (i >= 10) {
            writeInt(i / 10);
        }
        // write the last digit of the parameter, by taking the last digit and converting it to the appropriate char
        // (by adding the ASCII value of 0.
        writer.write((i % 10) + '0');
        // VERY IMPORTANT: IO operations are expensive, so Writers delay the actual writing to disk until a certain number
        // of chars need to be written, so it can do it in one step. In order to force it to write them, we need to explicitly
        // call the flush() method.
        writer.flush();
    }

    /**
     * Determining if the end of the file was reached can be done by checking if the last read char was -1.
     */
    @Override
    public boolean hasReachedEnd() {
        return lastRead == -1;
    }

    /**
     * all readers and writers need to be closed when their job is done.
     */
    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
        if (writer != null) {
            writer.close();
        }
    }
}
