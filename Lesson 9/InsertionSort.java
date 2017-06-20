//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 3
/*Description of Program:
*
* This is the InsertionSort class that will be used by the TestSort class.
* Insertion sort seems more efficient as there are less iterations during the sorting operation.
*
*/


public class InsertionSort {

    public void insertionSortMethod(int []someNums){



        int temp = 0;

        int a=1;

        while(a < someNums.length){
            temp = someNums[a];
            int b = a-1;
            while(b >=0 && someNums[b] > temp){
                someNums[b+1]=someNums[b];
                --b;
            }
            someNums[b+1]=temp;
            ++a;

        }

        System.out.print("Sorted Array through insertion sort:\n");
        for(int x = 0; x < someNums.length; ++x){
            System.out.print(someNums[x] + " ");
            System.out.println();
        }

    }
}
