package CodeChef; // REMOVE PACKAGE 
import java.util.*;

public class COCONUT { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            /* WRITE YOUR CODE HERE */
            int t = sc.nextInt();
            while (t-- > 0) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int xA = sc.nextInt();
                int xB = sc.nextInt();
                int res = (xA / A) + (xB / B);
                System.out.println(res);
            }
            
            sc.close();
        } catch(Exception e) {
            return;
        }
        
    }
}
