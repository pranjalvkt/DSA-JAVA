package CodeChef; // REMOVE PACKAGE 
import java.util.*;

public class SLOOP { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            /* WRITE YOUR CODE HERE */
            int t = sc.nextInt();
            while (t-- > 0) {
                int m = sc.nextInt();
                int s = sc.nextInt();
                int res = m / s;
                System.out.println(res);
            }
            
            sc.close();
        } catch(Exception e) {
            return;
        }
        
    }
}
