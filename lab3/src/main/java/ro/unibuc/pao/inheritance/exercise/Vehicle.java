package ro.unibuc.pao.inheritance.exercise;

public class Vehicle {

    private final int numberOfWheels;
    private final int maxSpeed;

    public Vehicle(int numberOfWheels, int maxSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
