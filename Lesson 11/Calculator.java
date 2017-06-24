/**
*Author: Sachin Haldipur
*Date: 6/24/2017
*Class Info: CIS163AA - Java Programming: Level I
*Lesson 11
*Exercise 2
*Description: This is a calculator app that will do multiplicaton
*and division operations.
*
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField textField1 = new JTextField(12);
    JTextField textField2 = new JTextField(12);
    JLabel result = new JLabel("Result: ");
    JButton divide = new JButton("Divide");
    JButton multiply = new JButton("Multiply");


    public Calculator(){

        super("Calculations");
        setSize(250,100);
        setLayout(new FlowLayout());

        add(textField1);
        add(textField2);
        add(divide);
        add(multiply);
        add(result);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multiply.addActionListener(this);
        divide.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        String tf1 = textField1.getText();
        String tf2 = textField2.getText();

        int tf1Int = Integer.parseInt(tf1);
        int tf2Int = Integer.parseInt(tf2);

        if(e.getActionCommand().equals("Multiply")){
            int product = getProduct(tf1Int, tf2Int);
            String productString = String.valueOf(product);
            result.setText(productString);
        }

        if(e.getActionCommand().equals("Divide")){
            int quotient = getQuotient(tf1Int, tf2Int);
            String quotientString = String.valueOf(quotient);
            result.setText(quotientString);
        }

    }

    public int getProduct(int tf1Int, int tf2Int){

        int product = tf1Int * tf2Int;

        return product;
    }

    public int getQuotient(int tf1Int, int tf2Int){

        int quotient = tf1Int/tf2Int;

        return quotient;

    }

}
