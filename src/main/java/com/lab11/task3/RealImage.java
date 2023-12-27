package com.lab11.task3;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private JFrame frame;

    public RealImage(String file) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(file);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.pack();
    }

    public void output() {
        frame.setVisible(true);
    }
}