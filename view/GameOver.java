package view;

import control.showData;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;


public class GameOver {
    JFrame frame = new JFrame("Game Over");
    private void buildPannel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));
        JLabel label = new JLabel("Game Over");
        JButton button = new JButton("Replay");
        JButton show= new JButton("Show Player's List");
        JButton exit= new JButton("Exit");

        panel.add(label);
        panel.add(button);
        panel.add(show);
        panel.add(exit);

        frame.add(panel);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Home();
                frame.dispose();
            }
        });
        show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                try {
                    new showData();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                frame.dispose();
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
    public void GameOverFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        buildPannel();
    }
}
