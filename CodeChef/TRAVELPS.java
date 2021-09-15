package CodeChef; // REMOVE PACKAGE 

import java.util.Scanner;

public class TRAVELPS { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int n,a,b;
                n = sc.nextInt(); // size of binary String
                a = sc.nextInt(); // inter-district time
                b = sc.nextInt(); // inter-state time
                sc.nextLine();
                 
                String str = sc.nextLine();
                int zeroCount = 0;
                int oneCount = 0;
                
                for (int j = 0; j < n; j++) {
                    if (str.charAt(j) == '0') {
                        zeroCount++;
                    } else {
                        oneCount++;
                    }
                }
                int res = (a * zeroCount) + (b * oneCount);
                System.out.println(res);
            }
            sc.close();
        } catch(Exception e) {
            return;
        }
    }
}
