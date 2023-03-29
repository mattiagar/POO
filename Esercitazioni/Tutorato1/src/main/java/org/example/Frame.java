package org.example;

import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        JFrame frame = new JFrame("Libreria");
        JPanel panel = new JPanel();







        add(panel);

        frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        frame.setLocation(600,300);
        frame.setSize(200,300);
        frame.setVisible(true);
    }
}
