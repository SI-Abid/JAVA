import javax.swing.*;

public class TodoList {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Todo List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);

        JCheckBox cb1 = new JCheckBox("JButton", true);
        JCheckBox cb2 = new JCheckBox("JLabel", true);
        JCheckBox cb3 = new JCheckBox("JTextField", true);
        JCheckBox cb4 = new JCheckBox("JRadiobutton");
        JCheckBox cb5 = new JCheckBox("JComboBox");
        JCheckBox cb6 = new JCheckBox("JList");
        JCheckBox cb7 = new JCheckBox("JMenu");
        JCheckBox cb8 = new JCheckBox("JCheckBox");
        JCheckBox cb9 = new JCheckBox("JPanel", true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
        panel.add(cb4);
        panel.add(cb5);
        panel.add(cb6);
        panel.add(cb7);
        panel.add(cb8);
        panel.add(cb9);

        frame.add(panel);
        frame.setVisible(true);
        
    }
}
