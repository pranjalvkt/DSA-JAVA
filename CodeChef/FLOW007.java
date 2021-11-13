package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class FLOW007 {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                int num = sc.nextInt();
                int reverse = 0;
                while(num != 0) {
                    int remainder = num % 10;  
                    reverse = reverse * 10 + remainder;  
                    num = num/10;  
                }
                System.out.println(reverse);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}