package ro.unibuc.pao.generics.entities;

public class Book implements Storable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
