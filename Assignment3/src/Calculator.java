import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {

    JFrame frame;
    JPanel top;
    JPanel bottomLeft;
    JPanel bottomRight;

    public Calculator() {
    
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 400);
        
        top = new JPanel();
        bottomLeft = new JPanel();
        bottomRight = new JPanel();

        top.setBackground(Color.BLUE);
        bottomLeft.setBackground(Color.RED);
        bottomRight.setBackground(Color.GREEN);

        top.setBounds(0, 0, 300, 100);
        bottomLeft.setBounds(0, 100, 220, 300);
        bottomRight.setBounds(220, 100, 80, 300);

        bottomLeft.setLayout(new GridLayout(4, 3));

        frame.add(top);
        frame.add(bottomLeft);
        frame.add(bottomRight);

        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();    
    }
}
