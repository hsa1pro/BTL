package view;
import java.awt.*;
import javax.swing.*;
public class guide {
    JFrame frame= new JFrame("Guide");
    public guide(){
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        buildPannel();
    }
    private void buildPannel(){
        //build guide
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(1,1));
        JTextArea guide= new JTextArea("Welcome to the Guide Page\n" +
                "This is a turn-base game that you can play with an AI.\n" +
                "Player have 100Hp and Boss has 150 HP. When HP drop 0, the game is over.\n" +
                "Click on Attack to peform a normal attack. It will deal from 10 to 60 damage base on chance.\n" +
                "Click on Heal to heal your HP.\n" +
                "Click on Skills to deal more damage to your enemy.\n" +
                "This game was created by Group 1.\n" +
                "To Duong Hung\n" +
                "Nguyen Ngoc Thai\n" +
                "Hoang Minh Hieu\n" +
                "Enjoy the game!");
        panel.add(guide);
        frame.add(panel);
    }
}