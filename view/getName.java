package view;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.time.LocalDateTime;
import control.database;
public class getName {
    JFrame frame = new JFrame("Who is snake?");
    public getName(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(410,300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        buildPannel();
    }
    private void buildPannel(){
        JLabel label = new JLabel("Enter your name");
        JTextField text = new JTextField();
        JButton button = new JButton("OK");
        ImageIcon img = new ImageIcon("D:/texture/getName.png");
        JLabel imgLabel= new JLabel(img);

        JPanel imgPanel = new JPanel();
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel();

        frame.add(BorderLayout.NORTH, imgPanel);
        imgPanel.add(imgLabel);
        frame.add(BorderLayout.CENTER, panel);
        panel.setLayout(new GridLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx =0;
        constraints.gridy = 0;
        constraints.weightx = 1;
        panel.add(label, constraints);
        constraints.gridx = 1;
        constraints.weightx = 4;
        panel.add(text, constraints);

        frame.add(BorderLayout.SOUTH, buttonPanel);
        buttonPanel.add(button);


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
