package ProblemSolving; // REMOVE PACKAGE while using CodeChef;


public class P1_SmallestMissingPositiveInteger {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        System.out.println(missingPositiveInteger(new int[] {3, 4, 6, -2, 1, 5, 16, 0, 2, 0}));
    }
    private static int missingPositiveInteger(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                break;
            }
        }
        if (count == 0) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int a = Math.abs(arr[i]);
            if (a == n) {
                //Value of any index is greater than the last index, so we'll update the 0th index
                arr[0] = -Math.abs(arr[0]);
            } else {
                arr[a] = -Math.abs(arr[a]);
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > 0) {
                return i;
            }
        }
        if (arr[0] > 0) {
            return n;
        }
        return n+1;
    }
}