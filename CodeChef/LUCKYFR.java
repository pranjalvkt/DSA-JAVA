package CodeChef; // REMOVE PACKAGE 
import java.util.*;

public class LUCKYFR { // CHANGE CLASS DECLARATION TO--> "class CodeChef"
    public static void main(String[] args) { 
        try {
            Scanner sc = new Scanner(System.in);
            /* WRITE YOUR CODE HERE */
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                String str = sc.nextLine();
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '4') count++;
                    else continue;
                } 
                System.out.println(count);
            }
            
            sc.close();
        } catch(Exception e) {
            return;
        }
        
    }
}
