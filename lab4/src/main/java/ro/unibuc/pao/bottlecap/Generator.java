package ro.unibuc.pao.bottlecap;

public abstract class Generator {

    public abstract String generateCode();

    public abstract int getLength();

    public static Generator getGenerator(boolean useCocaCola) {
        if (useCocaCola) {
            return new CocaColaGenerator();
        } else {
            return new PepsiGenerator();
        }
    }

}
