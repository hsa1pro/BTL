package control;

import java.sql.*;
import java.util.ArrayList;

import model.player;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class showData {
    static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/gamewinner";
    static final String USER = "root";
    static final String PASS = "";

   //show on Jtable



    public showData() throws SQLException {
        JFrame jFrame = new JFrame();
        // Frame Title
        jFrame.setTitle("Player's List");
        ArrayList<player> data =new ArrayList<>();
        String[] columnNames = { "Player's Name", "Time"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        // The 0 argument is number rows.
        JTable jTable = new JTable(tableModel);


        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();) {
            String sql = "SELECT * FROM gamewinner";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                model.player p = new player();
                p.setName(rs.getString(1));
                p.setTime(rs.getString(2));
                data.add(p);
                String[] c ={p.getName(),p.getTime()};
                tableModel.addRow(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //



        // Data to be displayed in the JTable
        // Column Names


        jTable.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(jTable);
        jFrame.add(sp);
        // Frame Size
        jFrame.setSize(500, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

}



