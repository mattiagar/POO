package it.unisa.hotelProject;

import java.util.HashSet;
import java.util.Set;

public class RoomManager {

    private Set<Room> roomSet;

    public RoomManager() {
        this.roomSet = new HashSet<>();
    }

    public void addRoom(Room room) {
        this.roomSet.add(room);
    }

    public Set returnAllRooms() {
        return roomSet;
    }
}
