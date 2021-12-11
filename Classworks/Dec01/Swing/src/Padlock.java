import javax.swing.*;
import java.awt.GridLayout;

public class Padlock {

    private String password="1234";
    private String input="";

    Padlock() {
        JFrame frame = new JFrame("Padlock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        panel.setSize(300, 300);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        JButton b1 = new JButton("Lock");
        JButton b2 = new JButton("Unlock");
        JButton b3 = new JButton("Reset");
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        button1.addActionListener(e -> input += "1");
        button2.addActionListener(e -> input += "2");
        button3.addActionListener(e -> input += "3");
        button4.addActionListener(e -> input += "4");
        button5.addActionListener(e -> input += "5");
        button6.addActionListener(e -> input += "6");
        button7.addActionListener(e -> input += "7");
        button8.addActionListener(e -> input += "8");
        button9.addActionListener(e -> input += "9");
        
        b1.addActionListener(l -> input = "");
        
        b2.addActionListener(l -> {
            if (input.equals(password)) {
                JFrame frame2 = new JFrame("Locker");
                ImageIcon icon = new ImageIcon("./images/java.png");
                JLabel label = new JLabel(icon);
                frame2.add(label);
                frame2.setSize(500, 500);
                frame2.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Wrong password", null, JOptionPane.ERROR_MESSAGE);
            }
            input = "";
        });
        
        b3.addActionListener(l -> {
            String tmp = JOptionPane.showInputDialog("Enter new password");
            password = tmp==null ? "1234" : tmp;
        });
        
        frame.add(panel);
        
        frame.setSize(300, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Padlock();
    }
}
