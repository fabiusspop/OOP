package L52_JavaButtons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame()
    {
        label = new JLabel();
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("Click here!");
        button.setFocusable(false);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            System.out.println("*click*");
            // button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
