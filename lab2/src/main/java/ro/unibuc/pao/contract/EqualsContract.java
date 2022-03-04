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

