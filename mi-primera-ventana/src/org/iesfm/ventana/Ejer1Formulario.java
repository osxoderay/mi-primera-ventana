package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Ejer1Formulario {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setBounds(10,10,300,450);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);
        fr.setContentPane(mainPanel);

        JLabel nameLabel = new JLabel("Usuario:"); // Se crea el label
        nameLabel.setForeground(Color.BLACK); // Cambio el color
        mainPanel.add(nameLabel);

        JTextField tf =new JTextField(16); //Creo el text field
        mainPanel.add(tf);


        JButton button = new JButton("Click here");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        mainPanel.add(button);

        fr.repaint();
        fr.revalidate();

    }
}
