package ro.unibuc.pao.contract;

import java.util.Objects;

public class EqualsContract {

    public static void main(String[] args) {
        Person person1 = new Person(10, "1234");
        Person person2 = new Person(20, "4567");
        Person person3 = new Person(10, "1234");

        if (person1 == person3) {
            System.out.println("Person #1 and Person #3 are the same");
        } else {
            System.out.println("Person #1 and Person #3 are different");
        }

        if (person1.equals(person3)) {
            System.out.println("Person #1 and Person #3 are the same");
        } else {
            System.out.println("Person #1 and Person #3 are different");
        }

        if (person1.hashCode() == person2.hashCode()) {
            System.out.println("Person #1 and Person #2 might be the same");
        } else {
            System.out.println("Person #1 and Person #2 are definitely different");
        }
    }

}

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