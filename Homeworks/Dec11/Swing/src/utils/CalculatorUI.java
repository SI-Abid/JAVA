package utils;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;

public class CalculatorUI {
    
    private JFrame frame;

    public CalculatorUI() {
        this(300, 500);
    }
    public CalculatorUI(int width, int height) {
        this(width, height, "Calculator");
    }
    public CalculatorUI(int width, int height, String title) {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JTextArea textArea = new JTextArea();
        // textArea.setEditable(false);
        textArea.setSize(width, 40);
        
        JPanel p = new JPanel();
        p.setBounds(0, 0, width, 40);
        p.add(textArea);
        
        frame.add(p);

        // Add the calculator panel to the frame
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));

        // Add the buttons to the panel
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonMultiply = new JButton("*");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMinus = new JButton("-");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonPlus = new JButton("+");
        JButton button0 = new JButton("0");
        JButton buttonDot = new JButton(".");
        JButton buttonClear = new JButton("C");
        JButton buttonEquals = new JButton("=");

        // Add the buttons to the panel
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonMultiply);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMinus);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonPlus);
        panel.add(button0);
        panel.add(buttonDot);
        panel.add(buttonClear);
        panel.add(buttonEquals);

        // Add the panel to the frame
        frame.add(panel);

        // button listeners
        button7.addActionListener(l -> textArea.setText(textArea.getText() + "7"));
        button8.addActionListener(l -> textArea.setText(textArea.getText() + "8"));
        button9.addActionListener(l -> textArea.setText(textArea.getText() + "9"));
        buttonMultiply.addActionListener(l -> textArea.setText(textArea.getText() + "*"));
        button4.addActionListener(l -> textArea.setText(textArea.getText() + "4"));
        button5.addActionListener(l -> textArea.setText(textArea.getText() + "5"));
        button6.addActionListener(l -> textArea.setText(textArea.getText() + "6"));
        buttonMinus.addActionListener(l -> textArea.setText(textArea.getText() + "-"));
        button1.addActionListener(l -> textArea.setText(textArea.getText() + "1"));
        button2.addActionListener(l -> textArea.setText(textArea.getText() + "2"));
        button3.addActionListener(l -> textArea.setText(textArea.getText() + "3"));
        buttonPlus.addActionListener(l -> textArea.setText(textArea.getText() + "+"));
        button0.addActionListener(l -> textArea.setText(textArea.getText() + "0"));
        buttonDot.addActionListener(l -> textArea.setText(textArea.getText() + "."));
        buttonClear.addActionListener(l -> textArea.setText(""));
        // buttonEquals.addActionListener(l -> textArea.setText(Calculator.calculate(textArea.getText())));
        buttonEquals.addActionListener(l -> {
            try {
                System.out.println(textArea.getText());
                textArea.setText(Calculator.calculate(textArea.getText()));
            } catch (Exception e) {
                textArea.setText("Error");
            }
        });

        frame.setVisible(true);
    }
}
