package GeneralProblems; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class MountBlueQ1 {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] strArr = new String[n];
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                strArr[i] = sc.nextLine();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < strArr[0].length()-1; j++) {
                    int temp1 = strArr[i].charAt(j);
                    int temp2 = strArr[i].charAt(j+1)-1;
                    if (temp1 != temp2) {
                        System.out.println(strArr[i]);
                    }
                }
            }

            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}