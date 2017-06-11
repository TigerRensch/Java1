//Author: Sachin Haldipur
//Date: 03/24/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Exercise 6b

/*
 *Description of Program: This program will convert inches to inches and feet but will accept the inches value
 *from the user.
 */
 
import javax.swing.JOptionPane;

public class InchesToFeetInteractive
{
   public static void main(String[]args)
   {      
     String initialInchesValueString; 
     int initialInchesValue;
     
     
     initialInchesValueString = JOptionPane.showInputDialog(null, "Enter the initial inches value","Measurements", JOptionPane.INFORMATION_MESSAGE);
     initialInchesValue = Integer.parseInt(initialInchesValueString);
     
     int feet = initialInchesValue/12;
     int inches = initialInchesValue % 12;
     
     JOptionPane.showMessageDialog(null, initialInchesValue + " inches is equal to " + feet + " feet and " + inches + " inches ");

          
   }
}