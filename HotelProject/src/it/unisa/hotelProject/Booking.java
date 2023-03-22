package it.unisa.hotelProject;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Booking {

    private GregorianCalendar checkIn;
    private GregorianCalendar checkOut;
    private Customer customer;
    private Room room;

    public Booking(GregorianCalendar checkIn, GregorianCalendar checkOut, Customer customer, Room room) {
        if (checkIn.before(checkOut)) {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        } else {
            throw new RuntimeException("Il checkin viene dopo il checkout");
        }
        this.customer = customer;
        this.room = room;
    }

    public GregorianCalendar getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(GregorianCalendar checkIn) {
        if (checkIn.before(this.checkOut)) {
            this.checkIn = checkIn;
        } else {
            throw new RuntimeException("Il checkin viene dopo il checkout");
        }
    }

    public GregorianCalendar getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(GregorianCalendar checkOut) {
        if (checkOut.after(this.checkIn)) {
            this.checkOut = checkOut;
        } else {
            throw new RuntimeException("Il checkout viene prima il checkin");
        }

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return checkIn + "," + checkOut + "," + customer + "," + room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return checkIn.equals(booking.checkIn) && checkOut.equals(booking.checkOut) && room.equals(booking.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkIn, checkOut, room);
    }
}
