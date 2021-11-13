package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class TSORT {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[] arr = new int[t];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();   
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}