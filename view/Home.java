package view;

import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

import static java.awt.Color.*;

public class Home extends JFrame{
    //Home Screen
    public Home(){
        JPanel menuPanel= new JPanel();
        JPanel buttonPanel= new JPanel();

        ImageIcon img = new ImageIcon("D:/texture/home.png");
        JLabel imgLabel= new JLabel(img, JLabel.CENTER);


        JButton start= new JButton("New Game");
        JButton more= new JButton("Learn More");
        JButton exit= new JButton("Exit");

        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        // create menu panel
        add(BorderLayout.CENTER, menuPanel);
        menuPanel.add(imgLabel);
        // create button pannel
        add(BorderLayout.SOUTH, buttonPanel);
        buttonPanel.setLayout(new GridLayout(3,1));
        buttonPanel.add(start);
        buttonPanel.add(more);
        buttonPanel.add(exit);

        // set event fot button
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
               new getName();
            }
        });

        more.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Credit v= new Credit();
                v.buildCredit();
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        Home h = new Home();
    }
}



