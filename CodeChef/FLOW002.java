package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class FLOW002 {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int rem = a % b;
                System.out.println(rem);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}