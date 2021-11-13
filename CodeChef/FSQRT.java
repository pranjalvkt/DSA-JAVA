package CodeChef; // REMOVE PACKAGE while using CodeChef

import java.util.Scanner;

public class FSQRT {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int ans = (int)Math.sqrt(n);
                System.out.println(ans);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}