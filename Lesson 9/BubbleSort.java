//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 3
/*Description of Program:
*
* This is the BubbleSort class that will be used by the TestSort class.
*
*
*/



public class BubbleSort {

    public void bubbleSortMethod(int []someNums){

        int temp = 0;

        for(int a=0; a < someNums.length-1; ++a){
            for(int b=0; b<someNums.length-1; ++b){
                if(someNums[b] > someNums[b+1]){
                    temp = someNums[b];
                    someNums[b] = someNums[b+1];
                    someNums[b+1] = temp;

                    System.out.print("Sorted Array through bubble sort:\n");
                    for(int x = 0; x < someNums.length; ++x){
                        System.out.print(someNums[x] + " ");
                        System.out.println();
                    }
                }

            }
        }


    }

}
