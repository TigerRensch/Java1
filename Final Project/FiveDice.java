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


import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;


public class FiveDice {

    public static void main(String[]args){
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;

        int cd1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd3 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd4 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int cd5 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        int diceValue = 0;
        int diceValueReturned = 0;


        Scanner input = new Scanner(System.in);

        ArrayList<Integer> computerDiceResults = new ArrayList<Integer>();
        ArrayList<Integer> humanDiceResults = new ArrayList<Integer>();
        ArrayList<Integer> occurrenceListComputer = new ArrayList<Integer>();
        ArrayList<Integer> occurrenceListHuman = new ArrayList<Integer>();

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


        //human dice results

        System.out.print("\nEnter numbers between one and six below to simulate the human dice roll.");
        System.out.print("\nEach value entered will be randomized to simulate a return of a value after the dice roll.");

        System.out.print("\nFirst dice value entered: >>");
        diceValue = input.nextInt();
        diceValueReturned = ((int)(Math.random() * 100) % diceValue);
        humanDiceResults.add(diceValueReturned);

        System.out.print("\nSecond dice value entered: >>");
        diceValue = input.nextInt();
        diceValueReturned = ((int)(Math.random() * 100) % diceValue);
        humanDiceResults.add(diceValueReturned);

        System.out.print("\nThird dice value entered: >>");
        diceValue = input.nextInt();
        diceValueReturned = ((int)(Math.random() * 100) % diceValue);
        humanDiceResults.add(diceValueReturned);

        System.out.print("\nFourth dice value entered: >>");
        diceValue = input.nextInt();
        diceValueReturned = ((int)(Math.random() * 100) % diceValue);
        humanDiceResults.add(diceValueReturned);

        System.out.print("\nFifth dice value entered: >>");
        diceValue = input.nextInt();
        diceValueReturned = ((int)(Math.random() * 100) % diceValue);
        humanDiceResults.add(diceValueReturned);

        Map<Integer, Integer> mp2 = new HashMap<Integer, Integer>();

        for (int integer : humanDiceResults) {

            if(mp2.keySet().contains(integer))
            {
                mp2.put(integer, mp2.get(integer)+1);

            }else
            {
                mp2.put(integer, 1);
            }
        }



        System.out.print("\nComputer dice results: " + computerDiceResults);
        System.out.print("\nOccurrences of kind of computer dice rolled: ");
        System.out.println(mp);


        System.out.print("\nHuman dice results: " + humanDiceResults);
        System.out.print("\nOccurrences of kind of human dice rolled: ");
        System.out.println(mp2);


        for (Entry entry : mp.entrySet()) {
            Object value = (Object) entry.getValue();
            String valueToString = value.toString();
            int valueInt = Integer.parseInt(valueToString);
            occurrenceListComputer.add(valueInt);
        }

        for (Entry entry : mp2.entrySet()) {
            Object value = (Object) entry.getValue();
            String valueToString = value.toString();
            int valueInt = Integer.parseInt(valueToString);
            occurrenceListHuman.add(valueInt);
        }

        System.out.println("Max occurrences of a kind in computer :" + Collections.max(occurrenceListComputer));
        System.out.println("Max occurrences of a kind in human :" + Collections.max(occurrenceListHuman));

        int maxOccurrencesComputer = Collections.max(occurrenceListComputer);

        int maxOccurrencesHuman = Collections.max(occurrenceListHuman);

        if(maxOccurrencesComputer > maxOccurrencesHuman){
            System.out.print("Computer wins the game.");
        }

        if(maxOccurrencesHuman > maxOccurrencesComputer){

            System.out.print("Human wins the game.");
        }

        if(maxOccurrencesComputer == maxOccurrencesHuman){
            System.out.print("It's a tie between human and computer");
        }



    }


}
