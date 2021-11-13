package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.Scanner;

public class FLOW017 {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (a >= b && a >= c) {
                    if(b >= c) {
                        System.out.println(b);
                    } else {
                        System.out.println(c);
                    }
                } else if(b >= c && b >= a) {
                    if(c >= a) {
                        System.out.println(c);
                    } else {
                        System.out.println(a);
                    }
                } else {
                    if(a >= b) {
                        System.out.println(a);
                    } else {
                        System.out.println(b);
                    }
                }
                
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}