/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 2
 *Game Zone 1 Exercise (p.117)
 *
 *
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MadLib extends JFrame implements ActionListener{


    JLabel adjective = new JLabel("Adjective: ");
    JTextField adjectiveText = new JTextField(12);

    JLabel noun = new JLabel("Noun: ");
    JTextField nounText = new JTextField(12);

    JLabel verb = new JLabel("Verb: ");
    JTextField verbText = new JTextField(12);

    JLabel adverb = new JLabel("Adverb: ");
    JTextField adverbText = new JTextField(12);

    JLabel adjective2 = new JLabel("Adjective 2: ");
    JTextField adjective2Text = new JTextField(12);

    JLabel noun2 = new JLabel("Noun 2: ");
    JTextField noun2Text = new JTextField(12);

    JLabel output = new JLabel("Output: ");

    JButton submit = new JButton("Submit");

   public MadLib(){

       super("Mad Lib");
       setSize(1000,1000);
       setLayout(new FlowLayout());

       add(adjective);
       add(adjectiveText);
       add(noun);
       add(nounText);
       add(verb);
       add(verbText);
       add(adverb);
       add(adverbText);
       add(adjective2);
       add(adjective2Text);
       add(noun2);
       add(noun2Text);

       add(submit);
       add(output);


       submit.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent e){

        String a = adjectiveText.getText();
        String n = nounText.getText();
        String v = verbText.getText();
        String av = adverbText.getText();
        String a2 = adjective2Text.getText();
        String n2 = noun2Text.getText();

        String poem = a + " " +  n + " " +  v + " " + av + " " + a2 + " " + n2;

        output.setText(poem);

        int confirm1 = JOptionPane.showOptionDialog(null,
                "Would you like to play the game again?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if(confirm1 == JOptionPane.YES_OPTION){
            adjectiveText.setText(" ");
            nounText.setText(" ");
            verbText.setText(" ");
            adverbText.setText(" ");
            adjective2Text.setText(" ");
            noun2Text.setText(" ");

        }

        if (confirm1 == JOptionPane.NO_OPTION) {
            System.exit(1);
        }

    }

}
