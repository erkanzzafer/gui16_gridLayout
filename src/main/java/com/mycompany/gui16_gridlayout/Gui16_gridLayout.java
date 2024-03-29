/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui16_gridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author zafer
 */
public class Gui16_gridLayout {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Grid Layout");
        
        JButton jb1 = new JButton("b1");
        JButton jb2 = new JButton("b2");
        JButton jb3 = new JButton("b3");
        JButton jb4 = new JButton("b4");
        JButton jb5 = new JButton("b5");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}
