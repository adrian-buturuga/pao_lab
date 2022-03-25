package ro.unibuc.pao.lab5.contracts.marker;

public abstract class Information {

    private String info;

    public Information(String info) {
        this.info = info;
    }

    public String get() {
        return info;
    }
}
