package view;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import control.*;
import model.*;
public class GUI {
   public void Menu() {
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
       int s = b.petHealth();
       int d = b.bossHealth();
       JLabel playerhp = new JLabel("Player's HP: " + s);
       JLabel bosshp = new JLabel("Boss's HP: " + d);

       JLabel notice= new JLabel("");

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

       panel.add(playerhp);
       panel.add(bosshp);

       panel3.add(notice);

       panel4.add(button);
       panel4.add(button2);
       panel4.add(button3);
       panel4.add(button4);

       frame.add(panel);
       frame.add(panel2);
       frame.add(panel3);
       frame.add(panel4);

       playerhp.setHorizontalTextPosition(SwingConstants.LEFT);
       bosshp.setHorizontalTextPosition(SwingConstants.RIGHT);

//       controlAction c= new controlAction();

       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.out.println("Player's Turn: ");
               System.out.println("Attack Skill");

               b.petAttack();
               b.petNoti1();
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   System.out.println("Ban da thang!");

                   System.exit(0);
               } else {
                   //Boss Turn
                   System.out.println("Boss's Turn: ");
                   b.BossAction();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   System.out.println("Ban da thua!");
                   System.exit(0);
               }
           }
       });


       button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.out.println("Player's Turn: ");
               System.out.println("Heal Skill");
               b.petHeal();
               b.petNoti2();
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   System.out.println("Ban da thang!");

                   System.exit(0);
               } else {
                   //Boss Turn
                   System.out.println("Boss's Turn: ");
                   b.BossAction();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   System.out.println("Ban da thua!");
                   System.exit(0);
               }
           }
       });

       button3.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.out.println("Player's Turn: ");
               System.out.println("Elemental Skill");
               b.petElemental();
               b.petNoti3();
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   System.out.println("Ban da thang!");

                   System.exit(0);
               } else {
                   //Boss Turn
                   System.out.println("Boss's Turn: ");
                   b.BossAction();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   System.out.println("Ban da thua!");
                   System.exit(0);
               }
           }
       });

       button4.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.out.println("Player's Turn: ");
               System.out.println("Burst Skill");
               b.petBurst();
               b.petNoti4();
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   System.out.println("Ban da thang!");

                   System.exit(0);
               } else {
                   //Boss Turn
                   System.out.println("Boss's Turn: ");
                   b.BossAction();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   System.out.println("Ban da thua!");
                   System.exit(0);
               }
           }
       });
   }
 }




