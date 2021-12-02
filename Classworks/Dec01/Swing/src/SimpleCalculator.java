import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Enter two numbers");
        label.setBounds(85, 10, 200, 30);
        frame.add(label);
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(35, 50, 100, 30);
        frame.add(textField1);
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(155, 50, 100, 30);
        frame.add(textField2);
        
        JButton button = new JButton("Add");
        button.setBounds(35, 100, 100, 30);
        frame.add(button);
        
        JButton button2 = new JButton("Subtract");
        button2.setBounds(155, 100, 100, 30);
        frame.add(button2);
        
        JLabel label2 = new JLabel("Result");
        label2.setBounds(50, 150, 100, 30);
        frame.add(label2);
        
        JTextField textField3 = new JTextField();
        textField3.setBounds(110, 150, 100, 30);
        frame.add(textField3);
        
        button.addActionListener(e -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 + num2;
            textField3.setText(String.valueOf(result));
        });

        button2.addActionListener(e -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 - num2;
            textField3.setText(String.valueOf(result));
        });

        frame.setVisible(true);
    }
}
