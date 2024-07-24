package test.algorithms;

import main.algorithms.InsertionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {
    @Test()
    public void sort() {
        int[] arr = {5, 2, 4, 6, 1, 3};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void sort2() {
        int[] arr = {31, 41, 59, 26, 41, 58};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, arr);
    }

    @Test
    public void sort3() {
        int[] arr = {6, 79, 93, 64, 50, 4, 54, 49, 21, 47, 78, 88, 84, 65, 59, 11, 95, 71, 26, 77, 10, 32, 99, 9, 61, 48, 27, 12, 31, 42, 56, 22, 19, 25, 16, 85, 87, 18, 30, 92, 53, 44, 96, 86, 89, 17, 41, 55, 66, 1, 40, 100, 2, 23, 39, 68, 35, 58, 38, 69, 34, 43, 29, 7, 75, 76, 81, 46, 80, 13, 62, 15, 28, 24, 91, 20, 94, 90, 72, 74, 51, 63, 33, 73, 67, 8, 82, 14, 3, 5, 60, 57, 52, 98, 45, 83, 37, 97, 70, 36};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, arr);
    }
}
