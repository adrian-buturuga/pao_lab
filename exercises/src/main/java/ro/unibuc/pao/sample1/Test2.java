package ro.unibuc.pao.sample1;

/**
 * Precizati care dintre urmatoarele afirmatii este adevarata pentru programul dat:
 *
 * a) exista erori de compilare in clasa Test
 *
 * b) exista erori de compilare in clasa B
 *
 * c) va afisa BPBQR dupa rulare
 *
 * d) va afisa APBQR dupa rulare
 */

class A {
    public static void metoda(String s) {
        System.out.println("A"+s);
    }
}

class B extends A {
    public static void metoda(String s) { System.out.print("B"+s);}
    public void metoda (String s, String t) { System.out.print("B"+s+t);}
}

public class Test2 {

    public static void main(String[] args) {
        A ob = new B();
        ob.metoda("P");
//        ob.metoda("Q", "R");
    }

}
