package ro.unibuc.pao.lap.serialization;
import java.io.*;


public class Main {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("d:/output")));

        Modifying m = new Modifying();
        m.t= 6;
        m.b = 3;
        m.x = 5;
        m.s = "Gigi";
        out.writeObject(m);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/output"));
        Modifying n = (Modifying)in.readObject();
        n.show();
        System.out.println(n.s);

    }
}
