//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan

 import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedColorPane extends JFrame {

    public TabbedColorPane() {
        setTitle("Tabbed Color Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with background colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add a change listener to display the color
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                String colorName = tabbedPane.getTitleAt(selectedIndex);
                System.out.println("Selected color: " + colorName);
            }
        });

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedColorPane();
    }
}
