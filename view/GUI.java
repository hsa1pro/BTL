package view;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import control.*;

public class GUI extends JFrame{
    battleGameFirstFirst b;
    JLabel playerhp;
    JLabel bosshp;
    JLabel petNotice;
    JLabel bossNotice;
   public void Menu() {
       JPanel hpPanel = new JPanel();
       JPanel battlePanel = new JPanel();
       JPanel noticePanel = new JPanel();
       JPanel buttonPanel = new JPanel();

       JButton button = new JButton("Attack");
       JButton button2 = new JButton("Heal");
       JButton button3 = new JButton("Elemental Skill");
       JButton button4 = new JButton("Burst Skill");

       b = new battleGameFirstFirst();
       playerhp = new JLabel("Player's HP: " + b.petHealth());
       bosshp = new JLabel("Boss's HP: " + b.bossHealth());
       petNotice = new JLabel("Let start");
       bossNotice = new JLabel("");
       ImageIcon img = new ImageIcon("texture/battle.gif");
       JLabel imgLabel = new JLabel(img, JLabel.CENTER);

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(800, 800);
       setLocationRelativeTo(null);
       setVisible(true);
       setResizable(false);


       buttonPanel.setLayout(new GridLayout(2, 2));
       buttonPanel.add(button);
       buttonPanel.add(button2);
       buttonPanel.add(button3);
       buttonPanel.add(button4);


       add(BorderLayout.CENTER,battlePanel);
       battlePanel.add(imgLabel);

       add(BorderLayout.SOUTH, noticePanel);
       JPanel notiPanel = new JPanel();
       noticePanel.setLayout(new GridLayout(2,1));
       notiPanel.add(petNotice);
       notiPanel.add(bossNotice);

       hpPanel.setLayout(new GridLayout(1,2));
       hpPanel.add(playerhp);
       hpPanel.add(bosshp);
       playerhp.setHorizontalTextPosition(SwingConstants.RIGHT);
       bosshp.setHorizontalTextPosition(SwingConstants.LEFT);

       noticePanel.setLayout(new GridLayout(3,1));
       noticePanel.add(hpPanel);
       noticePanel.add(notiPanel);
       noticePanel.add(buttonPanel);

       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               b.petAttack();
               b.petETD();
               b.petBTD();
               petNotice.setText(b.petNoti1());
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   dispose();
                   new gameWin();
               } else {
                   //Boss Turn
                   botTurn();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   dispose();
                   new gameLoose();
               }
           }
       });

       button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               b.petHeal();
               b.petETD();
               b.petBTD();
               petNotice.setText(b.petNoti2());
               bosshp.setText("Boss's HP: "+ b.bossHealth());
               if (b.bossHealth()<=0) {
                   dispose();
                   new gameWin();
               } else {
                   //Boss Turn
                   botTurn();
                   playerhp.setText("Player's HP: "+ b.petHealth());
               }
               if(b.petHealth()<=0){
                   dispose();
                   new gameLoose();
               }
           }
       });

       button3.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (b.petET() > 0) {
                   petNotice.setText("Co the su dung lai sau " + b.petET() + " luot.");
                   bossNotice.setText("");
               }
               else{
                   b.petElemental();
                   b.petBTD();
                   petNotice.setText(b.petNoti3());
                   bosshp.setText("Boss's HP: "+ b.bossHealth());
                   if (b.bossHealth()<=0) {
                       dispose();
                       new gameWin();
                   } else {
                       //Boss Turn
                       botTurn();
                       playerhp.setText("Player's HP: "+ b.petHealth());
                   }
                   if(b.petHealth()<=0){
                       dispose();
                       new gameLoose();
                   }
               }

           }
       });

       button4.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               if (b.petBT() > 0) {
                   petNotice.setText("Co the su dung lai sau " + b.petBT() + " luot.");
                   bossNotice.setText("");
               }
               else {
                   b.petBurst();
                   b.petETD();
                   petNotice.setText(b.petNoti4());
                   bosshp.setText("Boss's HP: "+ b.bossHealth());
                   if (b.bossHealth()<=0) {
                       dispose();
                       new gameWin();
                   } else {
                       //Boss Turn
                       botTurn();
                       playerhp.setText("Player's HP: "+ b.petHealth());
                   }
                   if(b.petHealth()<=0){
                       dispose();
                       new gameLoose();
                   }
               }
           }
       });
   }

    public void botTurn(){
        Random generator = new Random();
        int bot = generator.nextInt((15 - 0) + 1) + 0;
        if (bot < 7)
        {
            b.bossAttack();
            bossNotice.setText(b.bossNoti1());
        }
        else if (bot < 11){
            b.bossHeal();
            bossNotice.setText(b.bossNoti2());
        }
        else if (bot < 14)
        {
            b.bossElemental();
            bossNotice.setText(b.bossNoti3());
        }
        else{
            b.bossBurst();
            bossNotice.setText(b.bossNoti4());
        }
    }

}




