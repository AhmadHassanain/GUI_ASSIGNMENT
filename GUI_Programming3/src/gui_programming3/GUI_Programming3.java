/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_programming3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ahmad
 */
public class GUI_Programming3 extends JFrame{
    private static Dimension d;
    private static JPanel JPanel1,JPanel2,JPanel3;
    private static JCheckBox JCheckBox1,JCheckBox2;
    private static JLabel JLabelx,JLabely;
    private static JTextField JTextField1,JTextField2;
    private static JButton JButton1,JButton2,JButton3;
    public GUI_Programming3() {
        JCheckBox1 = new JCheckBox("Snap to Grid");
        JCheckBox2 = new JCheckBox("Show Grid");
        JPanel1 = new JPanel(new GridLayout(2, 1, 0, 0));
        JPanel1.add(JCheckBox1);
        JPanel1.add(JCheckBox2);
        add(JPanel1);

        JLabelx = new JLabel("X:");
        JTextField1 = new JTextField(3);
        JLabely = new JLabel("Y:");
        JTextField2 = new JTextField(3);
        JPanel2 = new JPanel(new GridLayout(2, 2, 0, 10));
        JPanel2.add(JLabelx);
        JPanel2.add(JTextField1);
        JPanel2.add(JLabely);
        JPanel2.add(JTextField2);
        add(JPanel2);

        JButton1 = new JButton("OK");
        JButton1.setFocusPainted(false);
        JButton2 = new JButton("Cancel");
       JButton2.setFocusPainted(false);
        JButton3 = new JButton("Help");
        JButton3.setFocusPainted(false);
        JPanel3 = new JPanel(new GridLayout(3, 1, 0, 10));
        JPanel3.add(JButton1);
        JPanel3.add(JButton2);
        JPanel3.add(JButton3);
        add(JPanel3);

        setTitle("Align");
        d = new Dimension(300, 150);
        setSize(d);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        new GUI_Programming3();
    }
    
}
