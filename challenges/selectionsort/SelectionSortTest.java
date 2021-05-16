package selectionsort;

import org.junit.Test;

import static org.junit.Assert.*;
import static selectionsort.SelectionSort.insertionSort;

public class SelectionSortTest {
    @Test
    public void edgeCaseTest() {
        Integer[] numbers = new Integer[0];
           assertEquals("the result should be empty", "",insertionSort(numbers));
        }

    @Test
    public void happyPath() {
       Integer[] numbers = {8,4,23,42,16,15};
           assertEquals( "the result should be", "4 8 15 16 23 42 ", insertionSort(numbers));
    }
}