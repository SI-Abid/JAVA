import utils.Button;
import javax.swing.*;
import java.awt.GridLayout;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        // Create a new frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel fp = new JPanel();
        JTextField tf = new JTextField(25);
        tf.setEditable(false);
        fp.add(tf);

        JPanel bp = new JPanel();
        bp.setLayout(new GridLayout(4,5));
        String buttonNames[] = {"7", "8", "9", "C", "AC", "4", "5", "6", "*", "/", "1", "2", "3", "+", "-", "0", ".", "=",};

        ArrayList<Button> buttons = new ArrayList<Button>();
        for (String buttonName : buttonNames) {
            Button b = new Button(buttonName);
            buttons.add(b);
        }

        for (Button b : buttons) {
            switch (b.getText()) {
                case "C":
                    b.addActionListener(l -> tf.setText(tf.getText().substring(0, tf.getText().length() - 1)));
                    break;
                case "AC":
                    b.addActionListener(l -> tf.setText(""));
                    break;
                case "=":
                    b.addActionListener(l -> tf.setText(evaluate(tf.getText())));
                    break;
                default:
                    b.connectTextField(tf);
                    break;
            }
            bp.add(b);
        }

        frame.add(fp);
        frame.add(bp);
        frame.setVisible(true);
    }
    public static String evaluate(String expression) {
        String result = "ANSWER";
        return result;
    }
}
