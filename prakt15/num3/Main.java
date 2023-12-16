package prakt15.num3;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        JMenu helpMenu = new JMenu("Справка");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JButton button1 = new JButton("Кнопка 1");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        buttonPanel.add(button1, constraints);
        JButton button2 = new JButton("Кнопка 2");
        constraints.gridx = 1;
        constraints.gridy = 0;
        buttonPanel.add(button2, constraints);
        JTextArea textArea = new JTextArea();
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Сохранено!\n");
            }
        });
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedText = textArea.getSelectedText();
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(selectedText);
                clipboard.setContents(stringSelection, null);
            }
        });
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.replaceSelection("");
            }
        });
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                Transferable transferable = clipboard.getContents(this);
                if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    try {
                        String clipboardText = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                        textArea.append(clipboardText); // добавляем в область
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.setJMenuBar(menuBar);
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}