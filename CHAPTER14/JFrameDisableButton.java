package CHAPTER14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {

    Container con = getContentPane();

    int count = 0;
    final int MAX = 8;
    final int SIZE = 180;

    JButton button = new JButton("Press Me");
    JLabel label = new JLabel("That's enough!");

    public JFrameDisableButton() {

        con.setLayout(new FlowLayout());
        con.add(button);
        con.add(label);

        label.setVisible(false);
        setSize(SIZE, SIZE);
        
        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
        if (count == 8) {
            button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setSize(250, 150);
    }   
}