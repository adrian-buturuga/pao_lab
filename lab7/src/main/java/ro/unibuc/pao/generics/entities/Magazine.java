package ro.unibuc.pao.generics.entities;

public class Magazine implements Storable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
