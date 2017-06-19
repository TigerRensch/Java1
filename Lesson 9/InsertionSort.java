/**
 * Created by sachinhaldipur on 6/18/17.
 */
public class InsertionSort {

    public void insertionSort(){

        int []someNums = new int [5];
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

    }
}
