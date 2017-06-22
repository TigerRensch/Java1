/**
 * Created by sachinhaldipur on 6/19/17.
 */

import java.util.*;

public class RealEstateFinder {

    public void SortPerPrice(String[][] array){

        Arrays.sort(array);

        display("Real estate sorted by price:        ", array);

    }

    public void SortPerLocation(String[][] array){

        Arrays.sort(array);

        display("Real estate sorted by location:        ", array);
    }

    public void Exit(){

        System.out.print("Thank you. You have exited the application.");

    }


    public static void display(String message, String[][] array){
        int i = array.length;
        System.out.print(message);
        for(int x = 0; x < i; ++x){
            System.out.print(array[x] + " ");
        }

        System.out.println();

    }

}
