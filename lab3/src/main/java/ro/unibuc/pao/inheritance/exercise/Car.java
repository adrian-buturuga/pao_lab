package ro.unibuc.pao.inheritance.exercise;

/**
 * The car needs to have 4 wheels, go at a top speed of 130 km/h and have an engine (either conventional or electric).
 * When creating a car instance, the number of wheels and max speed should always be said values, without the
 * possibility to change them. The engine can be changed later on, but can never be missing.
 * <p>
 * Note: the getter for the engine must be called getEngine().
 */

public class Car extends Vehicle {

    private Engine engine;

    public Car(Engine engine) {
        super(4, 130);
        if (engine == null) {
            engine = Engine.CONVENTIONAL;
        }
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        if (engine != null) {
            this.engine = engine;
        }
    }
}
