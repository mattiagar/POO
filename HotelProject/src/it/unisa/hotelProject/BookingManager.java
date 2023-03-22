package it.unisa.hotelProject;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookingManager {

    private Set<Booking> bookingSet;

    public BookingManager() {
        bookingSet = new HashSet<>();
    }

    public void addBooking(Booking booking) throws Exception {
        boolean isBookingAdded = this.bookingSet.add(booking);
        if (!isBookingAdded) {
            throw new Exception("La prenotazione già esiste");
        }
    }

    public boolean isRoomAvailable(Booking booking) {
        if (this.bookingSet.contains(booking)) {
            return false;
        } else {
            return true;
        }
    }

    public void removeBooking(Booking booking) {
        this.bookingSet.remove(booking);
    }

    public Set returnAllBookings() {
        return bookingSet;
    }

    public Set returnBookingsForARoom(Room room) {
        Set<Booking> result = new HashSet<>();
        for (Booking booking : this.bookingSet) {
            if (booking.getRoom().equals(room)) {
                result.add(booking);
            }
        }
        return result;
    }

    public void modifyBooking(Booking bookingToModify, Customer customer, Room room, GregorianCalendar checkIn, GregorianCalendar checkOut) {
        for (Booking booking : bookingSet) {
            if (booking.equals(bookingToModify)) {
                booking.setCustomer(customer);
                booking.setRoom(room);
                booking.setCheckIn(checkIn);
                booking.setCheckOut(checkOut);
            }
        }
    }

    public void loadBookingsFromFile(File file) throws Exception {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String newBookingLine = scanner.nextLine();
            String[] newBookingTokens = newBookingLine.split(",");
            if (newBookingTokens.length == 11) {
                Customer customer = new Customer(newBookingTokens[0], newBookingTokens[1], newBookingTokens[2], newBookingTokens[3]);
                int floorNumber = Integer.parseInt(newBookingTokens[5]);
                Room.RoomType roomType = Room.RoomType.valueOf(newBookingTokens[6]);
                Room room = new Room(newBookingTokens[4], floorNumber, roomType, newBookingTokens[7], newBookingTokens[8]);
                String[] checkInTokens = newBookingTokens[9].split("-");
                String[] checkOutTokens = newBookingTokens[10].split("-");
                GregorianCalendar checkIn = new GregorianCalendar(Integer.parseInt(checkInTokens[2]), Integer.parseInt(checkInTokens[1]) - 1, Integer.parseInt(checkInTokens[0]));
                GregorianCalendar checkOut = new GregorianCalendar(Integer.parseInt(checkOutTokens[2]), Integer.parseInt(checkOutTokens[1]) - 1, Integer.parseInt(checkOutTokens[0]));
                Booking booking = new Booking(checkIn, checkOut, customer, room);
                if (!checkOut.after(new GregorianCalendar())) {
                    this.bookingSet.add(booking);
                }
            } else {
                throw new IOException();
            }
        }
    }
}
