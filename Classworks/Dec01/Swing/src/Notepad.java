import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Notepad {

    private JTextArea textArea;

    public Notepad() {
        JFrame frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenuBar(frame);
        createTextField(frame);

        // add scrollbar
        JScrollPane scrollPane = new JScrollPane(frame.getContentPane().getComponent(0));
        frame.getContentPane().add(scrollPane);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(null);
        File file = fileChooser.getSelectedFile();
        if (file != null) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(textArea.getText());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createTextField(JFrame frame) {
        textArea = new JTextArea();
        frame.add(textArea);
    }

    public void createMenuBar(JFrame frame) {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu formatMenu = new JMenu("Format");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        JMenuItem pageSetupMenuItem = new JMenuItem("Page Setup");
        JMenuItem printMenuItem = new JMenuItem("Print");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        JMenuItem undoMenuItem = new JMenuItem("Undo");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        JMenuItem deleteMenuItem = new JMenuItem("Delete");
        JMenuItem findMenuItem = new JMenuItem("Find");
        JMenuItem findNextMenuItem = new JMenuItem("Find Next");
        JMenuItem replaceMenuItem = new JMenuItem("Replace");
        JMenuItem goToMenuItem = new JMenuItem("Go To");
        JMenuItem selectAllMenuItem = new JMenuItem("Select All");
        JMenuItem timeDateMenuItem = new JMenuItem("Time/Date");

        JMenuItem wordWrapMenuItem = new JMenuItem("Word Wrap");
        JMenuItem fontMenuItem = new JMenuItem("Font");

        JMenuItem statusBarMenuItem = new JMenuItem("Status Bar");

        JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.add(pageSetupMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.add(exitMenuItem);

        editMenu.add(undoMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(deleteMenuItem);
        editMenu.add(findMenuItem);
        editMenu.add(findNextMenuItem);
        editMenu.add(replaceMenuItem);
        editMenu.add(goToMenuItem);
        editMenu.add(selectAllMenuItem);
        editMenu.add(timeDateMenuItem);

        formatMenu.add(wordWrapMenuItem);
        formatMenu.add(fontMenuItem);

        viewMenu.add(statusBarMenuItem);

        helpMenu.add(aboutNotepadMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        saveMenuItem.addActionListener(e -> saveFile());

        openMenuItem.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            if (file != null) {
                try {
                    FileReader fileReader = new FileReader(file);
                    JTextArea textArea = (JTextArea) frame.getContentPane().getComponent(0);
                    textArea.read(fileReader, null);
                    fileReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        newMenuItem.addActionListener(e -> {
            JTextArea textArea = (JTextArea) frame.getContentPane().getComponent(0);
            textArea.setText("");
        });

        exitMenuItem.addActionListener(e -> System.exit(0));

        aboutNotepadMenuItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Notepad", "About Notepad", JOptionPane.INFORMATION_MESSAGE);
        });

        fontMenuItem.addActionListener(e -> {
            // create a font list
            JList<String> fontList = new JList<String>(new String[] { "Serif", "SansSerif", "Monospaced", "Dialog",
                    "DialogInput", "Courier", "Arial", "Times New Roman", "Verdana" });
            fontList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            fontList.setSelectedIndex(0);
            // create a font size list
            JList<Integer> fontSizeList = new JList<Integer>(new Integer[] { 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28,
                    30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78,
                    80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120 });
            fontSizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            fontSizeList.setSelectedIndex(0);
            // create a font style list
            JList<String> fontStyleList = new JList<String>(new String[] { "Plain", "Bold", "Italic", "Bold Italic" });
            fontStyleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            fontStyleList.setSelectedIndex(0);
            // create a font color list
            JList<String> fontColorList = new JList<String>(new String[] { "Black", "Blue", "Cyan", "Dark Gray", "Gray",
                    "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow" });
            fontColorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            fontColorList.setSelectedIndex(0);

            JPanel fontPanel = new JPanel();
            fontPanel.setLayout(new BoxLayout(fontPanel, BoxLayout.Y_AXIS));
            //
            fontPanel.add(new JLabel("Font:"));
            JScrollPane fontScrollPane = new JScrollPane(fontList);
            fontScrollPane.setPreferredSize(new Dimension(100, 100));
            fontPanel.add(fontScrollPane);
            //
            fontPanel.add(new JLabel("Size:"));
            JScrollPane fontSizeScrollPane = new JScrollPane(fontSizeList);
            fontSizeScrollPane.setPreferredSize(new Dimension(100, 100));
            fontPanel.add(fontSizeScrollPane);
            //
            fontPanel.add(new JLabel("Style:"));
            JScrollPane fontStyleScrollPane = new JScrollPane(fontStyleList);
            fontStyleScrollPane.setPreferredSize(new Dimension(100, 100));
            fontPanel.add(fontStyleScrollPane);
            //
            fontPanel.add(new JLabel("Color:"));
            JScrollPane fontColorScrollPane = new JScrollPane(fontColorList);
            fontColorScrollPane.setPreferredSize(new Dimension(100, 100));
            fontPanel.add(fontColorScrollPane);

            int result = JOptionPane.showConfirmDialog(frame, fontPanel, "Font", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                // JTextArea textArea = (JTextArea) frame.getContentPane().getComponent(0);
                textArea.setFont(new Font(fontList.getSelectedValue(), Font.PLAIN,
                        Integer.parseInt(fontSizeList.getSelectedValue().toString())));
                textArea.setForeground(Color.BLACK);
                switch (fontStyleList.getSelectedValue().toString()) {
                    case "Plain":
                        textArea.setFont(new Font(fontList.getSelectedValue(), Font.PLAIN,
                                Integer.parseInt(fontSizeList.getSelectedValue().toString())));
                        break;
                    case "Bold":
                        textArea.setFont(new Font(fontList.getSelectedValue(), Font.BOLD,
                                Integer.parseInt(fontSizeList.getSelectedValue().toString())));
                        break;
                    case "Italic":
                        textArea.setFont(new Font(fontList.getSelectedValue(), Font.ITALIC,
                                Integer.parseInt(fontSizeList.getSelectedValue().toString())));
                        break;
                    case "Bold Italic":
                        textArea.setFont(new Font(fontList.getSelectedValue(), Font.BOLD + Font.ITALIC,
                                Integer.parseInt(fontSizeList.getSelectedValue().toString())));
                        break;
                }
                switch (fontColorList.getSelectedValue().toString()) {
                    case "Black":
                        textArea.setForeground(Color.BLACK);
                        break;
                    case "Blue":
                        textArea.setForeground(Color.BLUE);
                        break;
                    case "Cyan":
                        textArea.setForeground(Color.CYAN);
                        break;
                    case "Dark Gray":
                        textArea.setForeground(Color.DARK_GRAY);
                        break;
                    case "Gray":
                        textArea.setForeground(Color.GRAY);
                        break;
                    case "Green":
                        textArea.setForeground(Color.GREEN);
                        break;
                    case "Light Gray":
                        textArea.setForeground(Color.LIGHT_GRAY);
                        break;
                    case "Magenta":
                        textArea.setForeground(Color.MAGENTA);
                        break;
                    case "Orange":
                        textArea.setForeground(Color.ORANGE);
                        break;
                    case "Pink":
                        textArea.setForeground(Color.PINK);
                        break;
                    case "Red":
                        textArea.setForeground(Color.RED);
                        break;
                    case "White":
                        textArea.setForeground(Color.WHITE);
                        break;
                    case "Yellow":
                        textArea.setForeground(Color.YELLOW);
                        break;
                }
            }

        });

    }

    public static void main(String[] args) {

        new Notepad();

    }
}
