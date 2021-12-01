package CodeChef; // REMOVE PACKAGE while using CodeChef;

import java.util.*;

public class COOMILK {// CHANGE CLASS DECLARATION TO--> "class CodeChef" 
// Remove "public" keyword before class name

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
		    int n=sc.nextInt();
		    String[] s=new String[n];
		    for(int i=0;i<n;i++){
		        s[i]=sc.next();
		    }
		    int c=0;
		    for(int i=0;i<n-1;i++){
		        if(s[i].equals("cookie") && s[i+1].equals("cookie")){
		            c++;
		            break;
		        }
		    }
		    if(c!=0 || s[n-1].equals("cookie"))System.out.println("NO");
		    else System.out.println("YES");
		}
        sc.close();
    }
}