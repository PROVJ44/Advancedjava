package adv5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPane {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("CMY Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String tabName = tabbedPane.getTitleAt(index);
                System.out.println(tabName + " tab selected");
            }
        });

        // Add to frame
        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}