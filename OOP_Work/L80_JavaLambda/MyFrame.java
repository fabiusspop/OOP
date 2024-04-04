package L80_JavaLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("MY BUTTON2");

    MyFrame()
    {
        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(

            (e) -> System.out.println("You clicked the button! ")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
                (e) ->
                {
                    System.out.println("You clicked the button2! ");
                    System.out.println("Pulan pizde!!! WSSSS");
                }
        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
