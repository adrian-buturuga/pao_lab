package ro.unibuc.pao.contract;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsContractTest {

    @Test
    public void testEquals() {
        Dog dog1 = new Dog("Lassie", "Border Collie", "1234");
        Dog dog2 = new Dog("Lightning", "Collie", "1234");
        Dog dog3 = new Dog("Lassie", "French bulldog", null);
        Dog dog4 = new Dog("lassie", "border collie", "1234");
        Dog dog5 = new Dog("Dexter", "Labrador", null);
        Dog dog6 = new Dog("Dexter", "Labrador", null);

        Assertions.assertEquals(dog1, dog2);
        Assertions.assertEquals(dog1, dog4);
        Assertions.assertNotEquals(dog1, dog3);
        Assertions.assertNotEquals(dog3, dog1);
        Assertions.assertNotEquals(dog3, dog5);
        Assertions.assertEquals(dog5, dog6);
    }
}
