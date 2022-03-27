package view;

import java.awt.*;
import javax.swing.*;

public class Credit {
    //build credit panel
    public static void buildCredit(){
        JFrame frame = new JFrame("Credit");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        JLabel label = new JLabel("BTL is created by: ");
        JLabel label1 = new JLabel("To Duong Hung");
        JLabel label2 = new JLabel("Nguyen Ngoc Thai");
        JLabel label3 = new JLabel("Hoang Minh Hieu");
        JLabel label4 = new JLabel("Thank you for playing!");

        //each label on 1 row

        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
       
  }
//  public static void main(String[] args) {
//        buildCredit();
//  }
}
