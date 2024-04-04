package L58_Joptionpane;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        // JOptionPane.showMessageDialog(null, "This is a message", "This is the title", JOptionPane.PLAIN_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "This is a message", "This is the title", JOptionPane.YES_NO_CANCEL_OPTION);

        // String name = JOptionPane.showInputDialog("What is your name?: ");
        // System.out.println("Hello " + name );

        String[] responses = {"No, you are!", "Thx!", "ahh"};

        JOptionPane.showOptionDialog(null,
                "Cool!",
                "This is the title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);

    }
}
