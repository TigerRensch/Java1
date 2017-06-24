/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Lesson 10
 *Exercise 1
 *  This is the RealEstateFinder class that will make use of the RealEstate class.
 */

import java.util.Arrays;
import java.util.Comparator;


public class RealEstateFinder {
    public void SortPerPrice(String[][] array){


        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(final String[] p1, final String[] p2) {
                final String price1 = p1[0];
                final String price2 = p2[0];
                return price1.compareTo(price2);
            }
        });

        System.out.println("Real estate sorted by price: ");

        for(final String[] s : array){

            System.out.println("$" + s[0] + " " + s[1] + " " + s[2]);

        }




    }

    public void SortPerLocation(String[][] array){



        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(final String[] p1, final String[] p2) {
                final String price1 = p1[0];
                final String price2 = p2[0];
                return price1.compareTo(price2);
            }
        });

        System.out.println("Real estate sorted by location: ");

        for(final String[] s : array){

            System.out.println(s[0] + " " + s[1] + " " + "$" + s[2]);

        }


    }

    public void Exit(){

        System.out.print("Thank you. You have exited the application.");

    }




}
