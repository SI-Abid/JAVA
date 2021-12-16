import java.util.ArrayList;

import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.*;
import java.math.BigDecimal;

import javax.swing.*;

public class Calculator {
    
    public Calculator() {
    
        int screenX=5, screenY=5, screenWidth=290, screenHeight=80;
        int numpadWidth=215, numpadHeight=270;
        int symbolWidth=70, symbolHeight=270;
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        JPanel top = new JPanel();
        JPanel bottomLeft = new JPanel();
        JPanel bottomRight = new JPanel();

        top.setBounds(screenX, screenY, screenWidth, screenHeight);
        bottomLeft.setBounds(screenX, screenY+screenHeight+5, numpadWidth, numpadHeight);
        bottomRight.setBounds(screenX+numpadWidth+5, screenY+screenHeight+5, symbolWidth, symbolHeight);

        JTextField input = new JTextField();
        JTextField output = new JTextField();

        input.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        output.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setEditable(false);

        top.add(input);
        top.add(output);

        top.setLayout(new GridLayout(2, 1));
        bottomLeft.setLayout(new GridLayout(4, 3));
        bottomRight.setLayout(new GridLayout(6, 1));

        String numpad[] = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "DEL"};
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        for (int i = 0; i < numpad.length; i++) {
            JButton button = new JButton(numpad[i]);
            bottomLeft.add(button);
            buttons.add(button);
        }

        String symbols[] = { "+", "-", "*", "/", "%", "=" };
        for (int i = 0; i < symbols.length; i++) {
            JButton button = new JButton(symbols[i]);
            bottomRight.add(button);
            buttons.add(button);
        }

        for (JButton button : buttons) {
            switch(button.getText()) {
                case "DEL":
                    button.addActionListener( l -> {
                        String text = input.getText();
                        if (text.length() > 0) {
                            input.setText(text.substring(0, text.length() - 1));
                        }
                    });
                    break;
                case "=":
                    button.addActionListener( l -> {
                        String text = input.getText();
                        if (text.length() > 0) {
                            output.setText(calculate(text));
                            // input.setText("");
                        }
                    });
                    break;
                default:
                    button.addActionListener( l -> input.setText(input.getText()+button.getText()));
                    break;
            }
        }

        // key listener on input
        input.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    String text = input.getText();
                    if (text.length() > 0) {
                        output.setText(calculate(text));
                        // input.setText("");
                    }
                }
                else if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                    String text = input.getText();
                    if (text.length() > 0) {
                        input.setText("");
                    }
                }
            }
        });

        frame.add(top);
        frame.add(bottomLeft);
        frame.add(bottomRight);

        frame.setVisible(true);

    }

    public static String calculate(String expresion) {
        BigDecimal result = new BigDecimal(0);
        String numerics[]=expresion.split("[-+/*%]+");
        String operators[]=expresion.split("[0-9]");
        BigDecimal numbers[]=new BigDecimal[numerics.length];

        for(int i=0;i<numerics.length;i++) {
            numbers[i]=new BigDecimal(numerics[i]);
        }
        result=numbers[0];
        int i=0;
        for(String operator : operators) {
            switch(operator) {
                case "+":
                    result=result.add(numbers[i+1]);
                    break;
                case "-":
                    result=result.subtract(numbers[i+1]);
                    break;
                case "*":
                    result=result.multiply(numbers[i+1]);
                    break;
                case "/":
                    result=result.divide(numbers[i+1]);
                    break;
                case "%":
                    result=result.remainder(numbers[i+1]);
                    break;
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }
}
