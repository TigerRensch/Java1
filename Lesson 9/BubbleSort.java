//Author: Sachin Haldipur
//Date: 06/11/2017
//Class Info: CIS163AA - Java Programming: Level I
//Lesson 9
//Exercise 2
/*Description of Program:
*
*
*
*
*/
public class BubbleSort {
    public void bubbleSort(){

        int []someNums = new int [5];
        int temp = 0;

        for(int a=0; a < someNums.length-1; ++a){
            for(int b=0; b<someNums.length-1; ++a){
                if(someNums[b] > someNums[b+1]){
                    temp = someNums[b];
                    someNums[b] = someNums[b+1];
                    someNums[b+1] = temp;
                }

            }
        }


    }

}
