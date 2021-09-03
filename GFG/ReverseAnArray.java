package GFG;

import java.util.*;

public class ReverseAnArray {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j = 0; j < n; j++) {
		        arr[j] = sc.nextInt();
		    }
		    reverseArray(arr, 0, n-1);
		    printArray(arr, n);
		}
		sc.close();
		
	}
	private static void reverseArray(int[] arr, int start, int end) {
	    int temp;
	    if(start >= end) {
	        return;
	    }
	    temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    reverseArray(arr, start+1, end-1);
	}
	private static void printArray(int[] arr, int n) {
	    for(int i = 0; i < n; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println("");
	}
}
