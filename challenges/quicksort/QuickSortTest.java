package quicksort;

import mergesort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.*;
import static selectionsort.SelectionSort.insertionSort;

public class QuickSortTest {
    QuickSort sortAlg = new QuickSort();

    @Test
     public void quickSortTest(){
        int[] actual = { 8,4,23,42,16,15 };
        int[] expected = { 4,8,15,16,23,42};

        sortAlg.quickSort(actual,0,actual.length-1);
        assertArrayEquals(expected, actual);
      }

    @Test
    public void edgeCaseTest() {
        Integer[] numbers = new Integer[0];
        Integer[] test = {};
        assertArrayEquals( test ,insertionSort(numbers));
    }

    @Test
    public void happyPath() {
        Integer[] numbers = {8,4,23,42,16,15};
        Integer[] sortedResult = {4,8, 15, 16, 23,42 };
        assertArrayEquals(  sortedResult, insertionSort(numbers));
    }

    @Test
    public void reverseSorted() {
        Integer[] numbers = {8,4,23,42,16,15};
        Integer[] sortedResult = {4,8, 15, 16, 23,42 };
        assertArrayEquals(  sortedResult, insertionSort(numbers));
    }

    @Test
    public void nearlySorted() {
        Integer[] numbers = {8,4,23,42,16,15};
        Integer[] sortedResult = {4,8, 15, 16, 23,42 };
        assertArrayEquals( sortedResult, insertionSort(numbers));
    }

    @Test
    public void fewUniques() {
        Integer[] numbers = {8,4,23,42,16,15};
        Integer[] sortedResult = {4,8, 15, 16, 23,42 };
        assertArrayEquals(  sortedResult, insertionSort(numbers));
    }

}