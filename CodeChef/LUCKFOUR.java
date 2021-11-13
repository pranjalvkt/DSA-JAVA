package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class LUCKFOUR {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                int count = 0;
                String str = sc.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '4') {
                        count++;
                    }
                }
                System.out.println(count);
            }
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}