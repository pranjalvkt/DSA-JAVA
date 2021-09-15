package CodeChef;

import java.util.Scanner;

public class BLITZ3_2 {
    public static void main(String[] args) throws java.lang.Exception {
        try {
		    Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
    
                int res = 360 + n*2 - (a + b);
                System.out.println(res);
    
            }
            sc.close();
		} catch(Exception e) {
		    return;
		}
    }
}
