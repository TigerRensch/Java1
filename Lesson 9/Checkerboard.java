//Author: Sachin Haldipur
//Date: 06/04/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 1
/*Description of Program:
 *
 *This class will class will create and display
 * a checkerboard using a two-dimensional array.
 */


import java.util.*;

public class Checkerboard {

    public static void main(String[] args){
        int [][] checkerBoard = new int [9][9];

        for(int i=0; i < checkerBoard.length; i++){

            for(int j=1; j < checkerBoard[i].length; j++){
                if(i % 2 == j % 2){
                    System.out.print("W ");
                }else{
                    System.out.print("B ");
                }
            }

            System.out.println();
        }

    }

}
