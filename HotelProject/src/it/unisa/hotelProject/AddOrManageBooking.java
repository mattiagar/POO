package it.unisa.hotelProject;

import javax.swing.*;
import java.awt.event.*;

public class AddOrManageBooking extends JDialog {
    private JPanel contentPane;
    private JButton addBooking;
    private JButton manageBooking;

    public AddOrManageBooking() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(addBooking);

        addBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAddBooking();
            }
        });

        manageBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onManageBooking();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onManageBooking();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onManageBooking();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onAddBooking() {
        // add your code here
        dispose();
    }

    private void onManageBooking() {
        // add your code here if necessary
        dispose();
    }
}
