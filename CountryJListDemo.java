package adv5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryJListDemo {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Set selection mode (single selection)
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // To avoid multiple events firing
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = list.getSelectedValue();
                    System.out.println("Selected: " + selectedCountry);
                }
            }
        });

        // Add scroll pane (important for JList)
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}