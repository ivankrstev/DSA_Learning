package main.algorithms;

public class QuickSort {
    public void sort(int[] arr) {
        sortRecursive(arr, 0, arr.length - 1);
    }

    public static void sortRecursive(int[] arr, int low, int high) {
        if (low >= high || low < 0) return;
        int pivotIndex = partition(arr, low, high);
        sortRecursive(arr, low, pivotIndex - 1);
        sortRecursive(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int tempPivotIndex = low;

        for (int i = low; i <= high - 1; i++) {
            if (arr[i] <= pivot) {
                swap(arr, tempPivotIndex, i);
                tempPivotIndex++;
            }
        }

        swap(arr, tempPivotIndex, high);
        return tempPivotIndex;
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
