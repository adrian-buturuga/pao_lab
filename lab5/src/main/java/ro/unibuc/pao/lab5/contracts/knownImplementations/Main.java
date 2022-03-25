package ro.unibuc.pao.lab5.contracts.knownImplementations;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        Person p1 = new Person("Ana", 23);
        Person p2 = new Person("Vlad", 12);
        Person p3 = new Person("Gigel", 22);

        Person[] attendees = {p1, p2, p3};

//        Arrays.sort(attendees, new MyComparator());

        for (Person p : attendees) {
            System.out.println(p);
        }

    }


}
