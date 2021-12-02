import javax.swing.*;

public class AdditionGUI {
    
    public static void main(String[] args) {
        // System.setProperty("java.awt.headless", "true");
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer:"));
        JOptionPane.showMessageDialog(null, x + " + "+ y + " = " + (x + y), "Addition", JOptionPane.PLAIN_MESSAGE);
        // System.out.println("Enter an integer: ");
    }    
}
