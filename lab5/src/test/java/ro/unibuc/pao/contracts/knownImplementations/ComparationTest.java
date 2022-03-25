package ro.unibuc.pao.contracts.knownImplementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparationTest {

    Person p1 = new Person("Ana", "mbc", 23);
    Person p2 = new Person("Vlad", "cbd", 12);
    Person p3 = new Person("Gigel", "bxd", 22);
    Person p4 = new Person("Anca", "hyt", 17);
    Person p5 = new Person("Anca", "rsa", 22);
    Person p6 = new Person("Mihai", "awe", 12);

    Person[] list;

    @BeforeEach
    public void setup() {
        list = new Person[]{p1, p2, p3, p4, p5, p6};
    }

    @Test
    public void testComparisonByAgeThenName() {
        checkClassImplements(AgeComparator.class, Comparator.class);
        Arrays.sort(list, (Comparator) new AgeComparator());
        checkOrder(list, p6, p2, p4, p5, p3, p1);

    }

    @Test
    public void testComparisonByNameThenAge() {
        checkClassImplements(NameComparator.class, Comparator.class);
        Arrays.sort(list, (Comparator) new NameComparator());
        checkOrder(list, p1, p4, p5, p3, p6, p2);
    }

    @Test
    public void testNaturalSort() {
        checkClassImplements(Person.class, Comparable.class);
        Arrays.sort(list);
        checkOrder(list, p1, p4, p5, p3, p6, p2);
    }

    private void checkOrder(Person[] list, Person... people) {
        Assertions.assertEquals(people[0], list[0], "Order is not correct");
        Assertions.assertEquals(people[1], list[1], "Order is not correct");
        Assertions.assertEquals(people[2], list[2], "Order is not correct");
        Assertions.assertEquals(people[3], list[3], "Order is not correct");
        Assertions.assertEquals(people[4], list[4], "Order is not correct");
        Assertions.assertEquals(people[5], list[5], "Order is not correct");
    }

    private void checkClassImplements(Class clazz, Class interf) {
        Class[] interfaces = clazz.getInterfaces();
        boolean found = false;
        for (Class c : interfaces) {
            if (c == interf) {
                found = true;
            }
        }
        if (!found) {
            Assertions.fail(clazz.getName() + " does not implement correct interface");
        }
    }
}
