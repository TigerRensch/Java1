/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 6
 *Exercise 2 (pp.350-351)
 *
 *RandomGuess3 class
 */

import java.util.Scanner;

public class RandomGuess3 {

    public static void main(String[]args){

        boolean run = true;
        final int YES = 1;
        final int NO = 2;
        int optionReceived;

        do{
            int randomNumber = (1 + (int)(Math.random() * 1000));
            int userNumber;

            Scanner input = new Scanner(System.in);

            System.out.print("\nThink of a number between 1 and 1000. Enter the number here: >> ");
            userNumber = input.nextInt();

            if(randomNumber > userNumber){
                System.out.print("\n" + randomNumber + " was greater than " + userNumber + ".");
                System.out.print("\nYour guess was too low.");
                System.out.print("\nThanks for playing the game.");


            } else if(randomNumber < userNumber){
                System.out.print("\n" + randomNumber + " was less than " + userNumber + ".");
                System.out.print("\nYour guess was too high.");
                System.out.print("\nThanks for playing the game.");


            }else if (randomNumber == userNumber){
                System.out.print("\n" + randomNumber + " equaled " + userNumber + ".");
                System.out.print("Your guess equaled the random number.");
                System.out.print("Play again? If yes enter " + YES + ".  If no enter " + NO + ".");
                optionReceived = input.nextInt();
                if(optionReceived == 2){
                    run = false;
                }
            }

        }while(run);

    }

}
