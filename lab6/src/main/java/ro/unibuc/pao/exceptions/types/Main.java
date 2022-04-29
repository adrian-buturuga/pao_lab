package ro.unibuc.pao.exceptions.types;

public class Main {

    public static boolean process(BaseClass obj) {
        try {
            obj.doSomething();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws CustomException {
        BaseClass obj = new BaseClass();
        if (process(obj)) {
            System.out.println("ok");
        } else {
            System.out.println("nok");
        }
    }

}
