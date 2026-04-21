package adv5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Tabbed Pane Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);
                System.out.println(title + " tab selected");
            }
        });

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        // Make visible
        frame.setVisible(true);
    }
}