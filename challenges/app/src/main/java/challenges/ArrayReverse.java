package challenges;
import java.util.ArrayList;
import java.util.Random;

public class ArrayReverse {
    public static void main(String[] args){
        int[] reverseItems = { 89, 2354, 3546, 23, 10, -923, 823, -12}; // array
        int[] newArray = reverseArray(reverseItems);  // store returned results.

    }

    public static int[] reverseArray(int[] numbers){
        int[] result = new int[numbers.length]; // create new array match original array size

        int length = numbers.length-1;

        /*
         * loop on each array new container start from 0 and original start from the end.
         * then save original current item in new array current index.
         */
        for(int i=0; i<=length; i++){
            result[i] = numbers[length-i];
            System.out.println(result[i]);
        }
        return result;
    }
}
