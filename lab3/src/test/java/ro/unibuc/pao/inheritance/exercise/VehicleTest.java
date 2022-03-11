//package ro.unibuc.pao.inheritance.exercise;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.support.ModifierSupport;
//
//class VehicleTest {
//
//    Vehicle bicycle;
//    Vehicle car;
//
//    @BeforeEach
//    public void setup() {
//        bicycle = new Bicycle();
//        car = new Car();
//    }
//
//    @Test
//    void testBycicleIsAVehicle() {
//        Assertions.assertTrue(bicycle instanceof Vehicle);
//    }
//
//    @Test
//    void testBicycleMaxSpeedIs20() {
//        Assertions.assertEquals(20, bicycle.getMaxSpeed());
//    }
//
//    @Test
//    void testBicycleHas2Wheels() {
//        Assertions.assertEquals(2, bicycle.getNumberOfWheels());
//    }
//
//    @Test
//    void testCarIsAVehicle() {
//        Assertions.assertTrue(car instanceof Vehicle);
//    }
//
//    @Test
//    void testCarMaxSpeedIs130() {
//        Assertions.assertEquals(130, car.getMaxSpeed());
//    }
//
//    @Test
//    void testCarHas4Wheels() {
//        Assertions.assertEquals(4, car.getNumberOfWheels());
//    }
//
////    @Test
////    void testCarHasEngine() {
////        Assertions.assertTrue(((Car)car).getEngine() != null);
////    }
//
//    @Test
//    void testCarSpeedCannotBeChanged() throws NoSuchFieldException {
//        boolean fieldIsFinalInParent = ModifierSupport.isFinal(Car.class.getSuperclass().getDeclaredField("maxSpeed"));
//        boolean setterThrowsException = false;
//        try {
//            car.setMaxSpeed(666);
//            Assertions.assertEquals(20, car.getMaxSpeed());
//        } catch (Exception e) {
//            setterThrowsException = true;
//        }
//        Assertions.assertTrue(fieldIsFinalInParent || setterThrowsException);
//    }
//
//    @Test
//    void testCarNumberOfWheelsCannotBeChanged() {
//        car.setNumberOfWheels(666);
//        Assertions.assertEquals(4, car.getNumberOfWheels());
//    }
//
//    @Test
//    void testBicycleSpeedCannotBeChanged() throws NoSuchFieldException {
//        boolean fieldIsFinalInParent = ModifierSupport.isFinal(Bicycle.class.getSuperclass().getDeclaredField("maxSpeed"));
//        boolean setterThrowsException = false;
//        try {
//            bicycle.setMaxSpeed(666);
//            Assertions.assertEquals(20, bicycle.getMaxSpeed());
//        } catch (Exception e) {
//            setterThrowsException = true;
//        }
//        Assertions.assertTrue(fieldIsFinalInParent || setterThrowsException);
//    }
//
//    @Test
//    void testBicycleNumberOfWheelsCannotBeChanged() {
//        bicycle.setNumberOfWheels(666);
//        Assertions.assertEquals(2, bicycle.getNumberOfWheels());
//    }
//}
