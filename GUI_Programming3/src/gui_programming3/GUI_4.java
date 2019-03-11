/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_programming3;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ahmad
 */
public class GUI_4 extends JFrame {
    
    public GUI_4(){
        DefaultListModel<String> DefaultList = new DefaultListModel<>();
        JList<String> list = new JList<>(DefaultList);
        list.setPreferredSize(new Dimension(100, 100));
        DefaultList.addElement("Black");
        DefaultList.addElement("Blue");
        DefaultList.addElement("Cyan");
        DefaultList.addElement("Dark Gray");
        DefaultList.addElement("Gray");
        JScrollPane slist = new JScrollPane(list);
        slist.setPreferredSize(new Dimension(120, 100));
        add(slist);
        
        JButton b1 = new JButton("Copy>>>");
        b1.setFocusPainted(false);
        add(b1);
        
        JTextArea area = new JTextArea();
        area.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(90, 90));
        add(scroll);
        
        setTitle("Multiple Selection Lists");
        setSize(450, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new GUI_4();
    }
    
}
