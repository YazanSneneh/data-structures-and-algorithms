
public class ArrayShift {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8};
        int newNumber = 5;
        int[] shiftedArray= insertShiftArray( numbers,  newNumber);

        for (int i=0; i<shiftedArray.length;i++){
            System.out.println(shiftedArray[i]);
        }
    }

    public static int[] insertShiftArray(int[] numbers, int newNumber){
        int numbersLength = numbers.length;
             int[] shiftedArray = new int[numbersLength+1];
             int middlePoint = numbersLength %2==0 ? numbersLength/2 : (numbersLength/2);

             shiftedArray[middlePoint] = newNumber;
             for (int i=0; i< numbers.length;i++){
                 if( i < middlePoint){
//                     continue;
                     shiftedArray[i]=numbers[i];
                 }else{
                     shiftedArray[i+1]=numbers[i];
                 }
             }
                 return shiftedArray;
    }
}