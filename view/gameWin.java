package view;

import javax.swing.*;
import java.awt.*;

public class gameWin extends GameOver{
    public gameWin(){
        create();
    }
    public void create(){
        ImageIcon img = new ImageIcon("texture/win.png");
        JLabel imgLabel= new JLabel(img, JLabel.CENTER);
        JPanel imgPanel = new JPanel();
        add(BorderLayout.CENTER, imgPanel);
        imgPanel.add(imgLabel);

        JPanel buttonPanel = new JPanel();
        add(BorderLayout.SOUTH, buttonPanel);
        buttonPanel.setLayout(new GridLayout(3,1));
        buttonPanel.add(replay);
        buttonPanel.add(show);
        buttonPanel.add(exit);
    }
}

