import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        
        JLabel label = new JLabel("What is the capital of Russia?");
        JRadioButton button1 = new JRadioButton("Moscow");
        JRadioButton button2 = new JRadioButton("Saint-Petersburg");
        JRadioButton button3 = new JRadioButton("Kiev");
        JRadioButton button4 = new JRadioButton("London");

        JLabel label2 = new JLabel("What is the capital of France?");
        JRadioButton button5 = new JRadioButton("Paris");
        JRadioButton button6 = new JRadioButton("London");
        JRadioButton button7 = new JRadioButton("Berlin");
        JRadioButton button8 = new JRadioButton("Madrid");

        JLabel label3 = new JLabel("What is the capital of Germany?");
        JRadioButton button9 = new JRadioButton("Berlin");
        JRadioButton button10 = new JRadioButton("London");
        JRadioButton button11 = new JRadioButton("Madrid");
        JRadioButton button12 = new JRadioButton("Paris");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        panel.add(label);
        
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        panel.add(label2);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(button5);
        group2.add(button6);
        group2.add(button7);
        group2.add(button8);

        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);

        panel.add(label3);
        
        ButtonGroup group3 = new ButtonGroup();
        group3.add(button9);
        group3.add(button10);
        group3.add(button11);
        group3.add(button12);

        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);

        frame.add(panel);

        frame.setVisible(true);
    }
}
