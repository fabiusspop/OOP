package L51_JavaPanels;

import javax.swing.*;
import java.awt.*;

public class JavaPanels {

    public static void main(String[] args)
    {
        JLabel label = new JLabel();
        label.setText("Hello!");
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0, 75, 75);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0, 250, 250);
        redpanel.setLayout(new BorderLayout());

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250, 500, 250);
        greenpanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}
