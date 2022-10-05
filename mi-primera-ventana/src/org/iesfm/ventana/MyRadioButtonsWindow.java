package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setBounds(10,10,300,450);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);


        ButtonGroup osBG = new ButtonGroup();

        JRadioButton linuxRd = new JRadioButton("Linux", true);
        linuxRd.setActionCommand("Linux");
        JRadioButton windowsRd = new JRadioButton("Windows");
        windowsRd.setActionCommand("Windows");
        JRadioButton macRd = new JRadioButton("Macintosh");
        macRd.setActionCommand("Macintosh");

        osBG.add(linuxRd);
        osBG.add(windowsRd);
        osBG.add(macRd);

        mainPanel.add(linuxRd);
        mainPanel.add(windowsRd);
        mainPanel.add(macRd);


        JLabel linuxLabel = new JLabel();
        linuxLabel.setSize(20,20);
        linuxLabel.setIcon(new ImageIcon("Linux.png"));

        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String selected = osBG.getSelection().getActionCommand();

                JOptionPane.showMessageDialog(fr,"Ha seleccionado" + selected);

                if (linuxRd.isSelected()){
                    linuxLabel.setIcon(new ImageIcon("Linux.png"));
                } else if (windowsRd.isSelected()){
                    linuxLabel.setIcon(new ImageIcon("Windows.png"));
                } else if (macRd.isSelected()){
                    linuxLabel.setIcon(new ImageIcon("Macintosh.png"));
                }

                // Otra manera de hacerlo sin usar el if, parecida a la de "ha seleccionado"

                // linuxLabel.setIcon(new ImageIcon(selected + ".png"));
            }
        });

        mainPanel.add(linuxLabel);
        mainPanel.add(okButton);

        fr.setContentPane(mainPanel);
        fr.repaint();
        fr.revalidate();
    }
}
