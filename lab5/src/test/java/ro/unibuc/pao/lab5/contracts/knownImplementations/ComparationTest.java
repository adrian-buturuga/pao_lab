package ro.unibuc.pao.lab5.contracts.knownImplementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparationTest {

    Person p1 = new Person("Ana", 23);
    Person p2 = new Person("Vlad", 12);
    Person p3 = new Person("Gigel", 22);
    Person p4 = new Person("Anca", 17);
    Person p5 = new Person("Anca", 22);
    Person p6 = new Person("Mihai", 12);

    Person[] list;

    @BeforeEach
    public void setup() {
        list = new Person[] {p1, p2, p3, p4, p5, p6};
    }

    @Test
    public void testComparisonByAgeThenName() {
        Class[] interfaces = AgeComparator.class.getInterfaces();
        boolean found = false;
        for (Class c : interfaces) {
            if (c == Comparator.class) {
                found = true;
            }
        }
        if (!found) {
            Assertions.fail("AgeComparator does not implement correct interface");
        }
        Arrays.sort(list, (Comparator)new AgeComparator());
        Assertions.assertEquals(p6, list[0], "Order is not correct");
        Assertions.assertEquals(p2, list[1], "Order is not correct");
        Assertions.assertEquals(p4, list[2], "Order is not correct");
        Assertions.assertEquals(p5, list[3], "Order is not correct");
        Assertions.assertEquals(p3, list[4], "Order is not correct");
        Assertions.assertEquals(p1, list[5], "Order is not correct");

    }

    @Test
    public void testComparisonByNameThenAge() {
        Class[] interfaces = NameComparator.class.getInterfaces();
        boolean found = false;
        for (Class c : interfaces) {
            if (c == Comparator.class) {
                found = true;
            }
        }
        if (!found) {
            Assertions.fail("NameComparator does not implement correct interface");
        }
        Arrays.sort(list, (Comparator)new NameComparator());
        Assertions.assertEquals(p1, list[0], "Order is not correct");
        Assertions.assertEquals(p4, list[1], "Order is not correct");
        Assertions.assertEquals(p5, list[2], "Order is not correct");
        Assertions.assertEquals(p3, list[3], "Order is not correct");
        Assertions.assertEquals(p6, list[4], "Order is not correct");
        Assertions.assertEquals(p2, list[5], "Order is not correct");

    }
}
