package challenges;

public class BinarySearch {
    public static void main(String[] args){
        System.out.print("");
    }
    public int BinarySearch (int[] numbers, int newNumber ){
        int value = 17;

        int l = 0;
        int h = numbers.length-1;
        int m = 0;

        while(numbers[m] != value){
            m = (l + h)/ 2;
            if(numbers[m] == value){
              return m;
             }

            if( l > h){
                return -1;
            }

            if (numbers[m] < value){
                l = m+1;
            }else{
                h = m - 1;
            }

         }
//        return -1;
    }
}
