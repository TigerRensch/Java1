//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 3
/*Description of Program:
*
* This is the TestSort class that will use both the BubbleSort and TestSort classes.
*
*
*/


public class TestSort {

    public static void main(String[]args){

        int []someNums = {20, 10, 5, 40, 35, 30, 70, 80, 100, 90};

        BubbleSort bubbleSort = new BubbleSort();

        InsertionSort insertionSort = new InsertionSort();

        bubbleSort.bubbleSortMethod(someNums);

        insertionSort.insertionSortMethod(someNums);
    }

}
