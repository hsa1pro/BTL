package view;

import javax.swing.*;

public class Credit extends JFrame{
    //build credit panel
    public Credit(){
        ImageIcon img = new ImageIcon("texture/more.png");
        JLabel imgLabel= new JLabel(img, JLabel.CENTER);
        setTitle("Credit");
        setContentPane(imgLabel);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400,550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
  }
}
