/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 4
 *Game Zone 1 Exercise (p.242)
 *
 *TwoDice class
 */


public class TwoDice {

    public static void main(String[]args){
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;

        int randomValue1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int randomValue2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

        System.out.print("\nAfter rolling die 1 its value is " + randomValue1 + ".");
        System.out.print("\nAfter rolling die 2 its value is " + randomValue2 + ".");

        if(randomValue1 > randomValue2){
            System.out.print("\nThe higher die value is " + randomValue1 + ".");
        }else if(randomValue2 > randomValue1){
            System.out.print("\nThe higher die value is " + randomValue2 + ".");
        }

    }

}
