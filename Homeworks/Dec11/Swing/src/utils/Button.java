package utils;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Button extends JButton {

    public Button() {
        this("Default");
    }
    public Button(String text) {
        this(text, 30, 15);
    }
    public Button(String text, int width, int height) {
        this(text, width, height, 20, 20);
    }
    public Button(String text, int width, int height, int x, int y) {
        super(text);
        setBounds(x, y, width, height);
    }
    public void setText(String text) {
        super.setText(text);
    }
    Button getButton() {
        return this;
    }
    public void connectTextField(JTextField textField) {
        addActionListener(l -> textField.setText(textField.getText() + getText()));
    }
}
