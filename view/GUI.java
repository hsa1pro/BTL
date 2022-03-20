package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import control.*;
import model.*;
public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Game Demo ");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        JButton button = new JButton("Attack");
        JButton button2 = new JButton("Heal");
        JButton button3 = new JButton("Elemental Skill");
        JButton button4 = new JButton("Burst Skill");

        battleGameFirstFirst b = new battleGameFirstFirst();
        int s= b.petHealth();
        int d= b.bossHealth();
        JLabel label1= new JLabel("Player's HP: "+ s);
        JLabel label2= new JLabel("Boss's HP: "+d);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(4, 1));
        panel.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(2, 1));
        panel3.setLayout(new GridLayout(2, 1));
        panel4.setLayout(new GridLayout(2, 2));

        panel.add(label1);
        panel.add(label2);

        panel4.add(button);
        panel4.add(button2);
        panel4.add(button3);
        panel4.add(button4);


        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        label1.setHorizontalTextPosition(SwingConstants.LEFT);
        label2.setHorizontalTextPosition(SwingConstants.RIGHT);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Attack");
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Heal");
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Elemental Skill");
            }
        });
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Burst Skill");
            }
        });
    }
}



