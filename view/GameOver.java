package view;
import control.showData;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
public class GameOver extends JFrame{
    JButton replay = new JButton("Replay");
    JButton show = new JButton("Show Player's List");
    JButton exit= new JButton("Exit");
    public GameOver(){
        setTitle("Game Over");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        replay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                GUI g = new GUI();
                g.Menu();
            }
        });
        show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                try {
                    new showData();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
