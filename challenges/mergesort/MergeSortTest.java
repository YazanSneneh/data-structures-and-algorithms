package mergesort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void positiveTest() {
        int[] actual = { 8,4,23,42,16,15 };
        int[] expected = { 4,8,15,16,23,42};

        MergeSort.mergeSort(actual);
        assertArrayEquals(expected, actual);
    }

}