package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String[] args) {
        JFrame f = new JFrame(); //Para definir/crear una ventana
        f.setBounds(10,10,300,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel mainPanel = new JPanel(); // Este es el panel principal
        f.setContentPane(mainPanel); // Hacemos que dentro del panel aparezca la etiqueta
        mainPanel.setBackground(Color.pink);

        JLabel label = new JLabel("Hola mundo"); //Este es un componente de tipo etiqueta
        label.setForeground(Color.white);
        mainPanel.add(label); // Aqui añadimos la etiqueta al panel






    }

}
