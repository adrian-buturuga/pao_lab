package ro.unibuc.pao.relationships.rooms;

import ro.unibuc.pao.relationships.furniture.Bed;
import ro.unibuc.pao.relationships.furniture.Furniture;

public class Bedroom implements Room {

    /** Furniture can exist regardless if it's in a room or not. So a (bed)room aggregates furniture in it. */
    private Furniture[] furniture;

    public Bedroom() {
        furniture = new Furniture[1];
        furniture[0] = new Bed();
    }

}
