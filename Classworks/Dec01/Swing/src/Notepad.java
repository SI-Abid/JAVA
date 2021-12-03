import javax.swing.*;

public class Notepad {

    public Notepad() {
        JFrame frame = new JFrame("Notepad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        
        new Notepad();

    }
}
