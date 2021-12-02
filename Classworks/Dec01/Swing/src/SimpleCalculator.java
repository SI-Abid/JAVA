import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Enter two numbers");
        label.setBounds(150,10,200,20);
        panel.add(label);

        JTextField textField1 = new JTextField(10);
        panel.add(textField1);

        JTextField textField2 = new JTextField(10);
        panel.add(textField2);

        JButton button = new JButton("Calculate");
        panel.add(button);

        JLabel resultLabel = new JLabel("Result");
        panel.add(resultLabel);

        JTextField resultField = new JTextField(10);
        panel.add(resultField);

        button.addActionListener(e -> {
            String text1 = textField1.getText();
            String text2 = textField2.getText();
            int number1 = Integer.parseInt(text1);
            int number2 = Integer.parseInt(text2);
            int result = number1 + number2;
            resultField.setText(String.valueOf(result));
        });
    }
}
