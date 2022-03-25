package ro.unibuc.pao.contracts.knownImplementations;

public class Person {

    private String name;
    private String cnp;
    private int age;

    public Person(String name, String cnp, int age) {
        this.name = name;
        this.cnp = cnp;
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ",\tage:" + age + ",\tcnp: " + cnp;
    }
}
