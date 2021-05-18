package quicksort;

import mergesort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort sortAlg = new QuickSort();

    @Test
     public void quickSortTest(){
        int[] actual = { 8,4,23,42,16,15 };
        int[] expected = { 4,8,15,16,23,42};

        sortAlg.quickSort(actual,0,actual.length-1);
        assertArrayEquals(expected, actual);
      }

}