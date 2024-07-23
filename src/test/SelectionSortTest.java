package test;

import main.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    @Test()
    public void sort() {
        int[] arr = {5, 2, 4, 6, 1, 3};
        new SelectionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);
    }

    @Test
    public void sort2() {
        int[] arr = {31, 41, 59, 26, 41, 58};
        new SelectionSort().sort(arr);
        assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, arr);
    }

    @Test
    public void sort3() {
        int[] arr = {30, 282, 15, 249, 102, 125, 202, 442, 142, 140, 131, 354, 412, 149, 298, 244, 376, 203, -11, 270, 343, 138, 350, 139, 158, 59, 490, 402, 276, 314, 98, 200, 431, 393, 261, 88, 349, 260, 467, 209, 134, 371, 205, 306, 72, -13, 413, 54, 282, 343, 324, 110, 333, 97, 352, 133, -30, 95, 436, -22, 487, 136, 75, 77, 289, 363, 29, 150, 196, 460, 442, 113, 466, 300, 36, 321, 135, 398, 366, 120, 107, -11, -17, 499, -30, 110, 320, 419, 491, 330, 450, 409, 281, 64, 160, 84, 96, 319, 468, 31};
        new SelectionSort().sort(arr);
        assertArrayEquals(new int[]{-30, -30, -22, -17, -13, -11, -11, 15, 29, 30, 31, 36, 54, 59, 64, 72, 75, 77, 84, 88, 95, 96, 97, 98, 102, 107, 110, 110, 113, 120, 125, 131, 133, 134, 135, 136, 138, 139, 140, 142, 149, 150, 158, 160, 196, 200, 202, 203, 205, 209, 244, 249, 260, 261, 270, 276, 281, 282, 282, 289, 298, 300, 306, 314, 319, 320, 321, 324, 330, 333, 343, 343, 349, 350, 352, 354, 363, 366, 371, 376, 393, 398, 402, 409, 412, 413, 419, 431, 436, 442, 442, 450, 460, 466, 467, 468, 487, 490, 491, 499}, arr);
    }
}