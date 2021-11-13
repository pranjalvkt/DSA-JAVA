package GeneralProblems; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class PrefixSum {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                // int n = 5;
                // int arr = new int[n];
                int[] arr = {4, 2, 3, 1, -5, 6};
                int res = 0;
                int[] prefixSumArr = new int[arr.length];
                int sum = 0;
                for (int i = 0; i < prefixSumArr.length; i++) {
                    sum += arr[i];
                    prefixSumArr[i] = sum;
                }
                res = prefixSumArr[r] - prefixSumArr[l-1];
                System.out.println(res);
                // for (int i = 0; i < prefixSumArr.length; i++) {
                //     System.out.println(prefixSumArr[i]);
                // }
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}