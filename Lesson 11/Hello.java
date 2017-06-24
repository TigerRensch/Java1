/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Lesson 11
 *Exercise 1
 *Description: When the user selects the button, the JLabel will update per
 * the following "Hello" and concatenate the first and last name together.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends JFrame implements ActionListener {

        JLabel enterName = new JLabel("Please enter your first and last name.");
        JTextField firstName = new JTextField(12);
        JTextField lastName = new JTextField(12);
        JLabel feedBack = new JLabel("Feedback:");
        JButton submit = new JButton("Submit");

        public Hello(){

            super("Hello Frame");
            setSize(250,100);
            setLayout(new FlowLayout());

            add(enterName);
            add(firstName);
            add(lastName);
            add(submit);
            add(feedBack);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            submit.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            String fName = firstName.getText();
            String lName = lastName.getText();

            String greet = "Hello, " + fName + " " + lName + ".";

            feedBack.setText(greet);
        }

}
