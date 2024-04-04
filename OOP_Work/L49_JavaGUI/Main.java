package L49_JavaGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); //creates a frame

        frame.setTitle("Title here! ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app

        frame.setResizable(false); //prevent frame from being resized

        frame.setSize(420,420);


        frame.setVisible(true); // make frame visible
    }
}
