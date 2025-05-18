import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.BufferedReader;

public class SimpleNotepad extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new SimpleNotepad();
    }
    JTextArea textArea;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;
    JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem,findMenuItem, replaceMenuItem, fontMenuItem;
    String currentFile = "";
    public SimpleNotepad() {
        super("Simple notepad");
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);
        openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);
        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);
        editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        findMenuItem = new JMenuItem("Find");
        findMenuItem.addActionListener(this);
        editMenu.add(findMenuItem);
        replaceMenuItem = new JMenuItem("Replace");
        replaceMenuItem.addActionListener(this);
        editMenu.add(replaceMenuItem);
        fontMenuItem = new JMenuItem("Font");
        fontMenuItem.addActionListener(this);
        editMenu.add(fontMenuItem);
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setSize(800, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem) (e.getSource());
        if (source == newMenuItem) {
            textArea.setText("");
            currentFile = "";
        } else if (source == openMenuItem) {
            openFile();
        } else if (source == saveMenuItem) {
            saveFile();
        } else if (source == exitMenuItem) {
            System.exit(0);
        } else if (source == findMenuItem) {
            findText();
        } else if (source == replaceMenuItem) {
            replaceText();
        } else {
        }
    }
    private void replaceText() {
        String searchTerm = JOptionPane.showInputDialog(this, "Enter text to find:", "Replace", JOptionPane.PLAIN_MESSAGE);
        String replaceTerm = JOptionPane.showInputDialog(this, "Enter text to replace with:", "Replace", JOptionPane.PLAIN_MESSAGE);
        if (searchTerm != null && !searchTerm.isEmpty() && replaceTerm != null) {
            int pos = 0;
            while ((pos = textArea.getText().indexOf(searchTerm, pos)) != -1) {
                textArea.replaceRange(replaceTerm, pos, pos + searchTerm.length());
                pos += replaceTerm.length();
            }
            JOptionPane.showMessageDialog(this, "Replace complete!", "Replace", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void findText() {
        String searchTerm = JOptionPane.showInputDialog(this, "Enter text to find:", "Find", JOptionPane.PLAIN_MESSAGE);
        if (searchTerm != null && !searchTerm.isEmpty()) {
            int position = textArea.getText().indexOf(searchTerm);
            if (position != -1) {
                textArea.setSelectionStart(position);
                textArea.setSelectionEnd(position + searchTerm.length());
            } else {
                JOptionPane.showMessageDialog(this, "Text not found!", "Find", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);
                StringBuilder text = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    text.append(line).append("\n");
                }
                br.close();
                reader.close();
                textArea.setText(text.toString());
                currentFile = file.getPath();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error opening file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void saveFile() {
        if (currentFile.isEmpty()) {
            saveAsFile();
        } else {
            try {
                FileWriter writer = new FileWriter(currentFile);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(textArea.getText());
                bw.close();
                writer.close();
                JOptionPane.showMessageDialog(this, "File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void saveAsFile() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filePath = file.getPath();
            if (!filePath.endsWith(".txt")) {
                filePath += ".txt";
            }
            try {
                FileWriter writer = new FileWriter(filePath);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(textArea.getText());
                bw.close();
                writer.close();
                currentFile = filePath;
                JOptionPane.showMessageDialog(this, "File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
