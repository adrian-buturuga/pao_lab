package ro.unibuc.pao.contracts.marker;

public class Main {

    private static void write(Information info) {
        if (info instanceof Writeable) {
            System.out.println(info.get());
        } else {
            System.out.println("******");
        }
    }

    public static void main(String[] args) {
        PublicInfo pub = new PublicInfo("Bacon Ipsum Dolor Sit Sirloin");
        SensitiveInfo priv = new SensitiveInfo("S0m3-P@$$");
        write(pub);
        write(priv);
    }


}
