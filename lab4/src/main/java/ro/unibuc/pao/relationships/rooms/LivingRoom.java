package ro.unibuc.pao.relationships.rooms;

import ro.unibuc.pao.relationships.furniture.Chair;
import ro.unibuc.pao.relationships.furniture.Furniture;
import ro.unibuc.pao.relationships.furniture.Table;

public class LivingRoom implements Room {

    /**
     * Furniture can exist regardless if it's in a room or not. So a (living )room aggregates furniture in it.
     */
    private Furniture[] furniture;

    public LivingRoom() {
        furniture = new Furniture[5];
        furniture[0] = new Table();
        for (int i = 1; i <= furniture.length; i++) {
            furniture[i] = new Chair();
        }
    }

}
