package CodeChef; // REMOVE PACKAGE 
import java.util.*;
import java.io.*;

public class SOLBLTY { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            FastReader fs = new FastReader();
            /* WRITE YOUR CODE HERE */
            int t = fs.nextInt();
            while (t-- > 0) {
                int x = fs.nextInt();
                int a = fs.nextInt();
                int b = fs.nextInt();

                int res = (a + (100 - x) * b) * 10;
                System.out.println(res);
            }
            

        } catch(Exception e) {
            return;
        }
        
    }
static class FastReader {
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader()
    {
        br = new BufferedReader(
        new InputStreamReader(System.in));
    }
 
    String next()
    {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              }
              catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
    }
 
    int nextInt() { return Integer.parseInt(next()); }
 
    long nextLong() { return Long.parseLong(next()); }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    float nextFloat()
    {
        return Float.parseFloat(next());
    }
 
    String nextLine()
    {
        String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        return str;
    }

    int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
    }

    long[] readArrayLong(int n) {
        long[] a=new long[n];
        for (int i=0; i<n; i++) a[i]=nextLong();
        return a;
    }
}
}