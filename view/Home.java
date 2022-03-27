package view;
import control.battleGameFirstFirst;

import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class Home {
    //Home Screen


    public Home(){
        JFrame home= new JFrame("Game Demo");

        JPanel label1= new JPanel();
        JPanel label2= new JPanel();

        JLabel title= new JLabel("Welcome To The Game!");
        JLabel slogan= new JLabel("DEAD OR ALIVE! YOUR CHOOSE!");

        JButton start= new JButton("New Game");
        JButton setting= new JButton("Setting");
        JButton more= new JButton("Learn More");
        JButton exit= new JButton("Exit");


        home.setSize(800, 600);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        home.setResizable(false);

        label1.setLayout(new GridLayout(2,1));
        label2.setLayout(new GridLayout(4, 1));

        home.add(label1);
        home.add(label2);

        label1.add(title);
        label1.add(slogan);
        label2.add(start);
        label2.add(setting);
        label2.add(more);
        label2.add(exit);

        title.setBounds(100, 50, 50, 50);
        slogan.setBounds(100, 150, 50, 50);
        start.setBounds(100, 250, 50, 50);
        setting.setBounds(100, 350, 50, 50);
        more.setBounds(100, 450, 50, 50);
        exit.setBounds(100, 550, 50, 50);

        //set size button
        start.setSize(50, 100);
        setting.setSize(50, 100);
        more.setSize(50, 100);
        exit.setSize(50, 100);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.dispose();
//                new Game();
                view.GUI a= new GUI();
                a.Menu();

            }
        });

        setting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.dispose();
//                new Setting();
            }
        });

        more.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.dispose();
//                new More();
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Home();
    }
}



