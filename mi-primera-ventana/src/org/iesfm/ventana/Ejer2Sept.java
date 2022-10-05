package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Ejer2Sept {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setBounds(10,10,300,450);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);
        mainPanel.setBounds(10,10,300,450);
        fr.setContentPane(mainPanel);

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.LIGHT_GRAY);
        secondPanel.setBounds(10,10,300,450);
        fr.setContentPane(secondPanel);

        JLabel nameLabel = new JLabel("Nombre:"); // Se crea el label
        nameLabel.setForeground(Color.BLACK); // Cambio el color
        mainPanel.add(nameLabel);

        JLabel secondNameLabel = new JLabel("Apellido"); // Se crea el label
        nameLabel.setForeground(Color.BLACK); // Cambio el color
        secondNameLabel.add(nameLabel);


    }
}
