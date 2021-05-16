package selectionsort;

public class SelectionSort {
    public static void main(String[] args){
                Integer[] numbers = {8 ,4 ,15 ,16, 23, 42};
//       String result  = insertionSort(numbers);
        insertionSort(numbers);
    }

    public static String insertionSort(Integer[] numbers){
        String result ="";
                 int length = numbers.length;

                 for(int i=0; i< length; i++){
                     int min  = i;  // current i is the new range

                     for(int j= i+1; j< length; j++){
                         if (numbers[j] < numbers[min])
                             min = j;

                         int temp = numbers[min];
                         numbers[min] = numbers[i];
                         numbers[i] = temp;
                     }
                 }
                 for (int i = 0; i < numbers.length; i++) {
                     result += numbers[i] + " ";
                 }
               return  result;
    }
}
