package ro.unibuc.pao.relationships;

import ro.unibuc.pao.relationships.rooms.Bedroom;
import ro.unibuc.pao.relationships.rooms.LivingRoom;
import ro.unibuc.pao.relationships.rooms.Room;

public class House {

    /** A room cannot exist without a house. Therefor, a house is composed of rooms. */
    private Room[] rooms;

    public House() {
        rooms = new Room[4];
        rooms[0] = new Bedroom();
        rooms[1] = new Bedroom();
        rooms[2] = new Bedroom();
        rooms[3] = new LivingRoom();
    }

    public static void main(String args[]) {
        House h = new House();
    }

}
