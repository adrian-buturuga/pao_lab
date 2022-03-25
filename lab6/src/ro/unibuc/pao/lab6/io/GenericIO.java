package ro.unibuc.pao.lab5.io;

import java.io.IOException;

public interface GenericIO {

    public int readInt() throws IOException;

    public void writeInt(int i) throws IOException;

    public boolean hasReachedEnd();

    public void close() throws IOException;

}
