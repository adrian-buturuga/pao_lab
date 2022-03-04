package ro.unibuc.pao.contract;

import java.util.Objects;

class Person {

    private int age;
    private String ssn;

    public Person(int age, String ssn) {
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, ssn);
    }
}
