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
public class GUI_3 extends JFrame{
    private static JLabel label1,label2;
    private static JTextArea area1,area2,area3;
    private static JCheckBox box1,box2,box3,box4;
    private static JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    private static JScrollPane scroll,scrol2,scrol3;
    private static ButtonGroup group;
    private static JButton JButton1,JButton2,JButton3,JButton4;
    private static JRadioButton Selection,All,Applet;
    public GUI_3() {

        label1 = new JLabel("Printer : MyPrinter");

         area1 = new JTextArea();
        area1.setLineWrap(true);
        scroll = new JScrollPane(area1);
        scroll.setPreferredSize(new Dimension(70, 70));

        box1 = new JCheckBox("Image");
        box2 = new JCheckBox("Text");
        box3 = new JCheckBox("Code");
        panel1 = new JPanel(new GridLayout(3, 1, 0, 0));
        panel1.add(box1);
        panel1.add(box2);
        panel1.add(box3);

        area2 = new JTextArea();
        area2.setLineWrap(true);
        scrol2 = new JScrollPane(area2);
        scrol2.setPreferredSize(new Dimension(70, 70));

        group = new ButtonGroup();
        panel2 = new JPanel(new GridLayout(3, 1, 0, 0));
        Selection = new JRadioButton("Selection", false);
        All = new JRadioButton("All", true);
        Applet = new JRadioButton("Applet", false);
        group.add(Selection);
        group.add(All);
        group.add(Applet);
        panel2.add(Selection);
        panel2.add(All);
        panel2.add(Applet);

        area3 = new JTextArea();
        area3.setLineWrap(true);
        scrol3 = new JScrollPane(area3);
        scrol3.setPreferredSize(new Dimension(70, 70));

        panel3 = new JPanel(new FlowLayout());
        panel3.add(scroll);
        panel3.add(panel1);
        panel3.add(scrol2);
        panel3.add(panel2);
        panel3.add(scrol3);

         label2 = new JLabel("Print Quality : ");

        JComboBox<String> box = new JComboBox<>();
        box.addItem("High");
        box.addItem("Medium");
        box.addItem("Low");
        box.setSelectedItem("High");

        box4 = new JCheckBox("Print to File");

        panel4 = new JPanel(new FlowLayout());
        panel4.add(label2);
        panel4.add(box);
        panel4.add(box4);

        panel5 = new JPanel(new GridLayout(3, 1, 0, 0));
        panel5.add(label1);
        panel5.add(panel3);
        panel5.add(panel4);

        add(panel5);
        JButton1 = new JButton("OK");
        JButton1.setFocusPainted(false);
        JButton2 = new JButton("Cancel");
        JButton2.setFocusPainted(false);
        JButton3 = new JButton("Setup...");
        JButton2.setFocusPainted(false);
        JButton4 = new JButton("Help");
        JButton3.setFocusPainted(false);
        panel6 = new JPanel(new GridLayout(4, 1, 0, 10));
        panel6.add(JButton1);
        panel6.add(JButton2);
        panel6.add(JButton3);
        panel6.add(JButton4);
        add(panel6);

        setTitle("Printer");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_3();
    }
    
}
