package L50_JavaLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("LabelText"); //set text of label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setBounds(0,0, 250, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.add(label);

    }
}
