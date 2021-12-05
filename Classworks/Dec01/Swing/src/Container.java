import javax.swing.*;

public class Container {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Leading University");

        JLabel label = new JLabel("Name");
        label.setBounds(10, 10, 80, 25);

        JTextField text = new JTextField("Enter Name");
        text.setBounds(100, 10, 160, 25);

        JButton button = new JButton("DONE");
        button.setBounds(10, 40, 80, 25);

        frame.add(label);
        frame.add(text);
        frame.add(button);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
