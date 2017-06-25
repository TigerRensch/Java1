/**
 *Author: Sachin Haldipur
 *Date: 6/24/2017
 *Class Info: CIS163AA - Java Programming: Level I
 *Final Project
 *Chapter 9
 *Exercise 7
 *
 *Services Finder class
 */


import java.util.Arrays;
import java.util.Comparator;

public class ServicesFinder {

    public void SortPerService(String[][] array){



        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(final String[] s1, final String[] s2) {
                final String service1 = s1[0];
                final String service2 = s2[0];
                return service1.compareTo(service2);
            }
        });

        System.out.println("Service data sorted by service description: ");

        for(final String[] s : array){

            System.out.println(s[0] + "," + "$" + s[1] + "," + "minutes: " + s[2]);

        }


    }

    public void SortPerPrice(String[][] array){


        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(final String[] p1, final String[] p2) {
                final String price1 = p1[0];
                final String price2 = p2[0];
                return price1.compareTo(price2);
            }
        });

        System.out.println("Service data sorted by price: ");

        for(final String[] s : array){

            System.out.println("$" + s[0] + "," + s[1] + "," + s[2]);

        }




    }

    public void SortPerTime(String[][] array){


        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(final String[] t1, final String[] t2) {
                final String time1 = t1[0];
                final String time2 = t2[0];
                return time1.compareTo(time2);
            }
        });

        System.out.println("Service data sorted by time: ");

        for(final String[] s : array){

            System.out.println("minutes: " + s[0] + "," + s[1] + "," + s[2]);

        }


    }

    public boolean Exit(){

        System.out.print("Thank you. You have exited the application.");
        return false;

    }

}
