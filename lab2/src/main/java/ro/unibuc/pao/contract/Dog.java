package ro.unibuc.pao.contract;

public class Dog {

    private String name;
    private String breed;
    private String chipNumber;

    public Dog(String name, String breed, String chipNumber) {
        this.name = name;
        this.breed = breed;
        this.chipNumber = chipNumber;
    }

    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
