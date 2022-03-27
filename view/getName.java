package view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.time.LocalDateTime;
import control.database;
public class getName {
    JFrame frame = new JFrame("Enter your name");
    public getName(){
        //get player name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        buildPannel();
    }
    private void buildPannel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Enter your name");
        JTextField text = new JTextField(10);
        JButton button = new JButton("OK");
        //set position of button center
        button.setHorizontalAlignment(JButton.CENTER);
        button.setBounds(100,100,100,50);

        panel.add(label);
        panel.add(text);
        panel.add(button);
        frame.add(panel);
        GUI gui = new GUI();
        database db = new database();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String namep = text.getText();
                String s= String.valueOf(LocalDateTime.now());
                if(namep==null || namep.equals("")){
                    JOptionPane.showMessageDialog(frame, "Please enter your name");
                }
                else{
                   gui.Menu();
                   frame.dispose();
                    try {
                        db.Insert(namep,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
                
            }
        });
    }
}
