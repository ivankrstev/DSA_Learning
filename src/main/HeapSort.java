package main;

public class HeapSort {
    public void sort(int[] arr) {
        // n is the size of the array
        int n = arr.length;
        // build the max heap from the array, starting from the last non-leaf node to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            // swap the root with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // build the max heap of the remaining elements(excluding the last element which is already sorted)
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        // build a max heap of elements present in the array, n is the size of the heap and i is the root node
        int max = i;
        // left child
        int left = 2 * i + 1;
        // right child
        int right = 2 * i + 2;
        // if left child is larger than root, set the left child as the largest
        if (left < n && arr[left] > arr[max]) {
            max = left;
        }
        // if right child is larger than the largest so far, set the right child as the largest
        if (right < n && arr[right] > arr[max]) {
            max = right;
        }
        // if the largest is not the root
        if (max != i) {
            // swap the root with the largest
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            // recursively heapify the affected subtree
            heapify(arr, n, max);
        }
    }
}
