import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class TicTacToe {
    private int turn = 0;

    public TicTacToe() {
        
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();    
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.add(panel);
        frame.setVisible(true);

        button1.addActionListener(l -> {
            button1.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button2.addActionListener(l -> {
            button2.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button3.addActionListener(l -> {
            button3.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button4.addActionListener(l -> {
            button4.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button5.addActionListener(l -> {
            button5.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button6.addActionListener(l -> {
            button6.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button7.addActionListener(l -> {
            button7.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button8.addActionListener(l -> {
            button8.setText(turn==0 ? "X" : "O");
            turn^=1;
        });
        button9.addActionListener(l -> {
            button9.setText(turn==0 ? "X" : "O");
            turn^=1;
        });

        // TODO: Implement the game logic

    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
