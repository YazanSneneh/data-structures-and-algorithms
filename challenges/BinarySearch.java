
public class BinarySearch {
    public static void main(String[] args){
        int[] firstList = {4,8,15,16,23,42};
        int[] secondList = {11,22,33,44,55,66,77};
        int[] thirstList = {1, 2, 3, 5, 6, 7};

        int[] empty = null;

        int searchKey = 15;
        int searchKeyTwo = 90;
        int searchKeyThree = 4;

        System.out.println("Element in the array should output, Found at Index : " + BinarySearch(firstList, searchKey));

        System.out.println("Element 90 not the array should output Index : " + BinarySearch(secondList, searchKeyTwo));

        System.out.println("Element 4 not the array should output Index : " + BinarySearch(thirstList, searchKeyThree));
        System.out.println("Empty array should output Index : " + BinarySearch(empty,searchKey ));
    }
  // if element found return index of element, else return -1
    public static int BinarySearch(int[] numbers, int key){
        try{
            int L = 0;
            int R = numbers.length -1;
            int m;
            while(L <=R){
                m = (L+R)/2;
                if(numbers[m] < key ){
                    L = m +1;
                }else if(numbers[m] > key){
                    R = m-1;
                }else{
                    return m;
                }
            }
        } catch (NullPointerException error){
               return -1;
        }
        return -1;
    }
}