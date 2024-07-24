package main.algorithms;

public class BubbleSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < i; k++) {
                if (arr[i] < arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
}
