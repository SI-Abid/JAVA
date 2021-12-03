import javax.swing.*;

public class ItemList {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JList<String> list = new JList<String>();
        list.setListData(new String[] { "Apple", "Banana", "Orange", "Grape", "Pineapple", "Strawberry", "Watermelon" });
        panel.add(list);

        JLabel label = new JLabel("Selected Item:");
        panel.add(label);

        JTextField textField = new JTextField(10);
        panel.add(textField);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);

        list.addListSelectionListener(e -> {
            String item = list.getSelectedValue();
            textField.setText(item);
        });

    }
}
