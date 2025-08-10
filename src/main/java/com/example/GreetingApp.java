package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingApp {
    private JFrame frame;
    private JTextField nameField;
    private JLabel outputLabel;

    public GreetingApp() {
        // Create the main window
        frame = new JFrame("Greeting Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel nameLabel = new JLabel("Enter your name: ");
        nameField = new JTextField(20);
        JButton submitButton = new JButton("Greet");
        outputLabel = new JLabel("");

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (!name.trim().isEmpty()) {
                    outputLabel.setText("Hi, " + name + "!");
                } else {
                    outputLabel.setText("Please enter a name!");
                }
            }
        });

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(submitButton);
        frame.add(outputLabel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GreetingApp().show();
            }
        });
    }
}
