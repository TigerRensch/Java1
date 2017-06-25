/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 4
 *Game Zone 1 Exercise (p.242)
 *
 *Die class
 */


public class Die {

    public static void main(String[]args){
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;

        int randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

        System.out.print("After rolling the dice the value is :" + randomValue);

    }

}
