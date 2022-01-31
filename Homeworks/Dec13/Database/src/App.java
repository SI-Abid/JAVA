import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // String pwd = "YOUR_DATABASE_PASSWORD_HERE";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS test");
            stmt.executeUpdate("USE test");
            // create student table if not exists
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), age INTEGER)");
            // delete student table if exists
            // stmt.executeUpdate("DROP TABLE IF EXISTS student");
            // create frame
            JFrame frame = new JFrame("Project");
            frame.setSize(500, 600);
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // create panel
            JPanel p1 = new JPanel();
            JLabel l1 = new JLabel("Full Name");
            JTextField t1 = new JTextField(20);
            JLabel l2 = new JLabel("Age");
            JTextField t2 = new JTextField(5);
            JButton b1 = new JButton("Add User");
            p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(b1);
            frame.add(p1);

            // create panel
            JPanel p2 = new JPanel();
            JLabel l3 = new JLabel("User Table");
            JTable table = new JTable();
            JScrollPane scrollPane = new JScrollPane(table);
            p2.add(l3);
            p2.add(scrollPane);
            frame.add(p2);

            // manually add data to table
            String[] columnNames = {"Name", "Age"};
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                model.addRow(new Object[] {name, age});
            }
            table.setModel(model);
            
            // add action listener

            b1.addActionListener(e -> {
                try {
                    Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                    Statement stmt2 = con2.createStatement();
                    String name = t1.getText();
                    String age = t2.getText();
                    if(name.equals("") || age.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {
                        stmt2.executeUpdate("INSERT INTO students (name, age) VALUES ('" + name + "', " + age + ")");
                        model.addRow(new Object[] {name, age});
                        t1.setText("");
                        t2.setText("");
                        // add new row to table
                        JOptionPane.showMessageDialog(null, "User added");
                        
                    }
                    con2.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            // add action listener to table
            table.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    // if(e.getButton()==MouseEvent.BUTTON1) {

                    //     int row = table.getSelectedRow();
                    //     // delete this row
                    //     String name = table.getValueAt(row, 0).toString();
                    //     String age = table.getValueAt(row, 1).toString();
                    //     int age2 = Integer.parseInt(age);
                    //     try {
                    //         Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                    //         Statement stmt3 = con3.createStatement();
                    //         stmt3.executeUpdate("DELETE FROM students WHERE name = '" + name + "' AND age = " + age2);
                    //         model.removeRow(row);
                    //         JOptionPane.showMessageDialog(null, "User deleted");
                    //         con3.close();
                    //     } catch (Exception ex) {
                    //         ex.printStackTrace();
                    //     }
                    // }
                    // if click button is right click

                    if(e.getButton()==MouseEvent.BUTTON1) {
                        int row = table.getSelectedRow();
                        // edit this row
                        String name = table.getValueAt(row, 0).toString();
                        String age = table.getValueAt(row, 1).toString();
                        int age2 = Integer.parseInt(age);
                        String newName = JOptionPane.showInputDialog(null, "Name: " + name);
                        int newAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Age: " + age));

                        try {
                            Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                            Statement stmt3 = con3.createStatement();
                            stmt3.executeUpdate("UPDATE students SET name = '" + newName + "', age = " + newAge + " WHERE name = '" + name + "' AND age = " + age2);
                            JOptionPane.showMessageDialog(null, "User updated");
                            con3.close();
                            table.setValueAt(newName, row, 0);
                            table.setValueAt(newAge, row, 1);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            
            frame.setVisible(true);
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
