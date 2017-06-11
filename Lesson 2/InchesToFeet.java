//Author: Sachin Haldipur
//Date: 03/24/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Exercise 6a
//Description of Program: This program will convert inches to inches and feet.

public class InchesToFeet
{
   public static void main(String[]args)
   {   
     int initialInches = 86;
     final int feet = initialInches/12;
     final int inches = initialInches % 12;
     
     
     System.out.println(initialInches + " inches is equal to " + feet + " feet and " + inches + " inches ");
     
     
   }
}