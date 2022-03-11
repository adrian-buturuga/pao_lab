package ro.unibuc.pao.inheritance.exercise;

/**
 * The bicycle is a type of vehicle that has 2 wheels, can go at a top speed of 20 km/h and does not have an engine like an auto-vehicle.
 * When creating a bicycle instance, the number of wheels and max speed should always be said values, without the
 * possibility to change them later.
 */

public class Bicycle extends Vehicle {

    public Bicycle() {
        super(2, 20);
    }

}

