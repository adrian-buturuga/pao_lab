package ro.unibuc.pao.sample1;

/**
 * Dupa executarea programului, se va afisa:
 * <p>
 * a) `ABCDE`
 * <p>
 * b) `ABDE`
 * <p>
 * c) `ABDEC`
 * <p>
 * d) `ABCD`
 */
public class Test4 {
    static String sir = "A";

    void A() {
        try {
            sir = sir + "B";
            B();
        } catch (Exception e) {
            sir = sir + "C";
        }
    }

    void B() throws Exception {
        try {
            sir = sir + "D";
            C();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            sir = sir + "E";
        }
    }

    void C() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        Test4 ob = new Test4();
        ob.A();
        System.out.println(sir);
    }
}

