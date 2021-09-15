package CodeChef; // REMOVE PACKAGE 
import java.util.*;

public class BLACKCEL { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            /* WRITE YOUR CODE HERE */
            int n = sc.nextInt();
            System.out.println(n*n/2);
            
            sc.close();
        } catch(Exception e) {
            return;
        }
        
    }
}
