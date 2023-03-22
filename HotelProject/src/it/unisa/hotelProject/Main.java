package it.unisa.hotelProject;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BookingManager bookingManager = new BookingManager();
        JFileChooser loadFileChooser = new JFileChooser();
        int result = loadFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                bookingManager.loadBookingsFromFile(loadFileChooser.getSelectedFile());
                AddOrManageBooking addOrManageBooking = new AddOrManageBooking();
                addOrManageBooking.setSize(400,400);
                addOrManageBooking.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Il file non è nel formato corretto", "Messaggio", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}