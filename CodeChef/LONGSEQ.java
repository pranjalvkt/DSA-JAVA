package CodeChef;

import java.io.*;
import java.util.Scanner;

public class LONGSEQ
{
    public static void main(String args[])throws IOException
    {
        /* WRITE YOUR CODE HERE */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            int d = sc.nextInt();
            int len = String.valueOf(d).length();
            
            int[] arr = new int[len];
            int oneCount = 0;
            int zeroCount = 0;

            for(int i = len-1; i >= 0; i--) {
                arr[i] = d % 10;
                d = d / 10;
            }
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 1) oneCount++;
                if(arr[i] == 0) zeroCount++;
            }
            if(oneCount > 1 && zeroCount > 1) System.out.println("No");
            else System.out.println("Yes");
        }
        sc.close();
    }
}
