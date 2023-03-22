package it.unisa.hotelProject;

import java.util.Objects;

public class Room {

    enum RoomType {
        SINGLE,
        DOUBLE,
        KINGROOM
    }

    final private String roomNumber;
    final private int floorNumber;
    final private RoomType roomType;
    final private String services;
    final private String phoneNumber;

    public Room(String roomNumber, int floorNumber, RoomType roomType, String services, String phoneNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.roomType = roomType;
        this.services = services;
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getServices() {
        return services;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return roomNumber + ',' + floorNumber + "," + roomType + "," + services + ',' + phoneNumber + ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber.equals(room.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber);
    }
}
