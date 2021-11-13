import java.util.*;

public class A381 {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int[] arr = new int[t];

            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
            int[] auxArr = new int[t];

            int i = 0;
            int j = t-1;

            for (int k = 0; k < auxArr.length; k++) {
                
            }
            
            int sum1 = 0;
            int sum2 = 0;
            for (i = 0; i < t; i++) {
                if (i % 2 == 0) {
                    sum1 += arr[i];
                } else {
                    sum2 += arr[i];
                }
            }

            System.out.println(sum2 + " " + sum1);
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}