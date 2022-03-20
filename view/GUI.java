package view;
import java.util.Random;
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
        do
        {
            b.setOption(0);
            b.petPassive();
            b.petNoti0();
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    b.setOption(1);
                    System.out.println("Attack");
                    b.petAttack();
                    b.petNoti1();
                }
            });
            button2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    b.setOption(2);
                    System.out.println("Heal");
                    b.petHeal();
                    b.petNoti2();
                }
            });
            button3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    b.setOption(3);
                    System.out.println("Elemental Skill");
                    b.petElemental();
                    b.petNoti3();
                }
            });
            button4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    b.setOption(4);
                    System.out.println("Burst Skill");
                    b.petBurst();
                    b.petNoti4();
                }
            });
            switch (b.getOption()){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            Random generator = new Random();
            int bot = generator.nextInt((15 - 0) + 1) + 0;
            b.bossNoti0();
            b.bossPassive();
            if (bot < 7)
            {
                b.bossAttack();
                b.bossNoti1();
            }
            else if (bot < 11){
                b.bossHeal();
                b.bossNoti2();
            }
            else if (bot < 14)
            {
                b.bossElemental();
                b.bossNoti3();
            }
            else{
                b.bossBurst();
                b.bossNoti4();
            }
        } while(b.check());

    }
}



