package ro.unibuc.pao.sample1;

import java.util.HashSet;

/**
 * Ce va afisa programul urmator?
 * a) 4 b) 3, c) 2, d) 1
 */

class Automobil {
    private String marca;

    public Automobil(String marca) {
        this.marca = marca;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object obj) {
        return true;
    }
}

public class Test1 {
    public static void main(String[] args) {
        HashSet<Automobil> la = new HashSet<>();
        la.add(new Automobil("Audi"));
        la.add(new Automobil("BMW"));
        la.add(new Automobil("Audi"));
        la.add(new Automobil("Open"));
        System.out.println(la.size());
    }

}
