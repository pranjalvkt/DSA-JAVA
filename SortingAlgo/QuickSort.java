package SortingAlgo;
import Resources.*;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,9,7,3,8,4};
        int low = 0;
        int high = arr.length-1;
        quickSort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                arr = Swap.swap(arr, i, j);
            }
        }
        arr = Swap.swap(arr, i+1, high);
        return i+1;
    }
    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
}
