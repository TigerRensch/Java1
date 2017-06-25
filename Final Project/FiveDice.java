/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 4
 *Game Zone 2 Exercise (p.243)
 *
 *FiveDice class
 */


import org.omg.CORBA.INTERNAL;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class FiveDice {

    public static void main(String[]args){
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;

        int cd1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd3 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd4 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd5 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);



        Scanner input = new Scanner(System.in);

        ArrayList<Integer> computerDiceResults = new ArrayList<Integer>();

        computerDiceResults.add(cd1);
        computerDiceResults.add(cd2);
        computerDiceResults.add(cd3);
        computerDiceResults.add(cd4);
        computerDiceResults.add(cd5);

        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        for (int integer : computerDiceResults) {

            if(mp.keySet().contains(integer))
            {
                mp.put(integer, mp.get(integer)+1);

            }else
            {
                mp.put(integer, 1);
            }
        }

        System.out.println("=mp="+mp);


    }
}
