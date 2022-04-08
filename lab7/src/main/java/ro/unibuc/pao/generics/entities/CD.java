package ro.unibuc.pao.generics.entities;

public class CD implements Storable {

    private String name;

    public CD(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
