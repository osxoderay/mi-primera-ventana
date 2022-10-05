package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTitleBorderWindow {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setBounds(10,10,300,450);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);

        JPanel searchPanel = new JPanel();
        searchPanel.setBorder(BorderFactory.createTitledBorder("Search:"));


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


        searchPanel.add(linuxRd);
        searchPanel.add(windowsRd);
        searchPanel.add(macRd);
        mainPanel.add(searchPanel);

        fr.setContentPane(mainPanel);
        fr.repaint();
        fr.revalidate();
    }
}
