package adv4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    ImageButtonDemo() {

        // Create frame
        frame = new JFrame("Image Button Demo");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);
        
        Dimension size = new Dimension(120, 120);
        btnClock.setPreferredSize(size);
        btnHourGlass.setPreferredSize(size);

        // Create label
        label = new JLabel("Click any button");

        // Add action listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Make visible
        frame.setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}