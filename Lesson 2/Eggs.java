//Author: Sachin Haldipur
//Date: 03/24/2017 
//Class Info: CIS163AA - Java Programming: Level I
//Exercise 8

/*
 *Description of Program: This program will prompt a user for the number of eggs in the order
 *and then display the amount owed with a full explanation.
 */

import java.util.Scanner;

public class Eggs
{
   public static void main(String[]args)
   {   
 
     int numOfEggs;
       
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Please enter the number of eggs >> ");
     numOfEggs = inputDevice.nextInt();
     
     int dozen = numOfEggs/12;
     int loose = numOfEggs % 12;
     final double DOZEN_PRICE = 3.25;
     final double LOOSE_PRICE = 0.45;
     double dozenCost = dozen * DOZEN_PRICE;
     double looseCost = loose * LOOSE_PRICE;
     double total = dozenCost + looseCost;
     
     inputDevice.nextLine();
     System.out.println("You ordered " + numOfEggs + " eggs. That is " + dozen + " dozen eggs at $3.25 per dozen and " + loose + " loose eggs at 45 cents each for a total of $" + total + "."); 
     
   }
}  