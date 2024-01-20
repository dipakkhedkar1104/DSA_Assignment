package dsaAssignment6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter your name: ");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Say Hello");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}

