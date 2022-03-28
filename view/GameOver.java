package view;

import control.showData;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;


public class GameOver extends JFrame{
    JButton replay = new JButton("Replay");
    JButton show = new JButton("Show Player's List");
    JButton exit= new JButton("Exit");
    public GameOver(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


        replay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Home();
                dispose();
            }
        });
        show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                try {
                    new showData();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                dispose();
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
