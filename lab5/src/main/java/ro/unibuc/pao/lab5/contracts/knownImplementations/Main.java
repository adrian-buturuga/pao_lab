package ro.unibuc.pao.lab5.contracts.knownImplementations;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given there are 3 persons in the `attendees` array, use the Arrays.sort() methods to sort them by the following
 * criteria:
 * - by CNP alphabetically
 * - by age ascending, then by name in case of equal age
 * - by name alphabetically, then by age in case of same name
 *
 * Note: Modify the other 3 classes in the package by using known interfaces, such as Comparator or Comparable for
 * this, as well as the overloaded methods:
 * - Arrays.sort(Object[])
 * - Arrays.sort(Object[], Comparator)
 *
 * Hint: you can also use the String.compareTo() method.
 */
public class Main {

    public static void main(String args[]) {
        Person p1 = new Person("Ana", "123", 23);
        Person p2 = new Person("Vlad", "432", 12);
        Person p3 = new Person("Gigel", "765", 22);

        Person[] attendees = {p1, p2, p3};

        Arrays.sort(attendees); // sorted by CNP
        displayArray(attendees);

        Arrays.sort(attendees, (Comparator) new AgeComparator()); // sorted primary by Age, secondary by Name
        displayArray(attendees);

        Arrays.sort(attendees, (Comparator) new NameComparator()); // sorted primary by Name, secondary by Age
        displayArray(attendees);
    }

    private static void displayArray(Person[] list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

}
