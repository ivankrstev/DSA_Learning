package main;

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find min value index from i to end of array
            int minIndex = i;
            for (int k = i + 1; k < arr.length; k++)
                if (arr[minIndex] > arr[k]) minIndex = k;
            // change min value index with i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
