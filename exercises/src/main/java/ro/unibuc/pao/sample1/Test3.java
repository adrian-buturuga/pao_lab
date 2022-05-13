package ro.unibuc.pao.sample1;

import java.io.*;

/**
 * De cate ori va fi afisat textul `Constructor`, dupa executarea programului dat?
 *
 * a) niciodata
 *
 * b) o data
 *
 * c) de doua ori
 *
 * d) de trei ori
 */

class Persoana implements Serializable {
    String nume;
    int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("Constructor");
    }
}

public class Test3 {

    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persoana.ser"));
        Persoana p = new Persoana("Popescu Ion", 40), q = p;
        oos.writeObject(q);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persoana.ser"));
        Persoana r = (Persoana) ois.readObject();
        ois.close();
    }

}
