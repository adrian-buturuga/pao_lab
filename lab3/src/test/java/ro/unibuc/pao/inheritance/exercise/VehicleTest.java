package ro.unibuc.pao.inheritance.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.support.ModifierSupport;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class VehicleTest {

    Vehicle bicycle;
    Vehicle car;

    @BeforeEach
    public void setup() {
        bicycle = new Bicycle();
        car = new Car(Engine.CONVENTIONAL);
    }

    @Test
    void testBycicleIsAVehicle() {
        Assertions.assertTrue(bicycle instanceof Vehicle, "Bicycle is not a Vehicle");
    }

    @Test
    void testBicycleMaxSpeedIs20() {
        Assertions.assertEquals(20, bicycle.getMaxSpeed(), "MaxSpeed of the Bicycle is not 20");
    }

    @Test
    void testBicycleHas2Wheels() {
        Assertions.assertEquals(2, bicycle.getNumberOfWheels(), "NumberOfWheels of the Bicycle is not 2");
    }

    @Test
    void testCarIsAVehicle() {
        Assertions.assertTrue(car instanceof Vehicle, "Car is not a Vehicle");
    }

    @Test
    void testCarMaxSpeedIs130() {
        Assertions.assertEquals(130, car.getMaxSpeed(), "MaxSpeed of the Car is not 130");
    }

    @Test
    void testCarHas4Wheels() {
        Assertions.assertEquals(4, car.getNumberOfWheels(), "NumberOfWheels of the Car is not 4");
    }

    @Test
    void testCarSpeedCannotBeChanged() throws Exception {
        checkFieldCannotBeChanged(Car.class, "maxSpeed", "setMaxSpeed", car, 666, 130);
    }

    @Test
    void testCarNumberOfWheelsCannotBeChanged() throws Exception {
        checkFieldCannotBeChanged(Car.class, "numberOfWheels", "setNumberOfWheels", car, 666, 4);
    }

    @Test
    void testBicycleSpeedCannotBeChanged() throws Exception {
        checkFieldCannotBeChanged(Bicycle.class, "maxSpeed", "setMaxSpeed", bicycle, 666, 20);
    }

    @Test
    void testBicycleNumberOfWheelsCannotBeChanged() throws Exception {
        checkFieldCannotBeChanged(Bicycle.class, "numberOfWheels", "setNumberOfWheels", bicycle, 666, 2);
    }

    @Test
    void testCarEngineCannotBeNull() throws NoSuchFieldException, IllegalAccessException {
        car = new Car(null);
        Engine eng = getField(Car.class, "engine", car, Engine.class);
        Assertions.assertNotNull(eng, "Engine can be set to null  ");
    }

    private <T> T getField(Class clazz, String fieldName, Object target, Class<T> resultClass) throws NoSuchFieldException, IllegalAccessException {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (T) field.get(target);
    }

    private void checkFieldCannotBeChanged(Class clazz, String fieldName, String setterName, Object target, int newValue, int testValue) throws Exception {
        boolean fieldIsFinalInParent = ModifierSupport.isFinal(clazz.getSuperclass().getDeclaredField(fieldName));
        try {
            // Check if setter exists and if it changes anything
            callPrivateMethodWithIntParam(setterName, clazz, target, newValue);
            Assertions.assertEquals(testValue, getField(clazz.getSuperclass(), fieldName, target, int.class), "Setter was present and allowed to change the field " + fieldName);
            return;
        } catch (NoSuchMethodException doesNotUseSetter) {
            // ignore, there is no setter defined
        }
        Assertions.assertTrue(fieldIsFinalInParent, "There is no setter, but field " + fieldName + " is not final");
    }

    private void callPrivateMethodWithIntParam(String methodName, Class clazz, Object target, int param) throws Exception {
        Method method = clazz.getSuperclass().getDeclaredMethod(methodName, int.class);
        method.invoke(target, param);
    }

}
