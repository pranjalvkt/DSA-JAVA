package LeetCode;

/*
*   @author
*   Pranjal Tripathi
*   Problem 20
*/

import java.util.Stack;

public class Problem20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
    	for(char ch:s.toCharArray()) {
    		if(ch == '(' || ch == '[' || ch == '{')
    			stack.push(ch);
    		else {
    			if(stack.empty())return false;
    			if(ch == ')' && stack.peek()!='(') return false;
    			if(ch == ']' && stack.peek()!='[') return false;
    			if(ch == '}' && stack.peek()!='{') return false;
    			stack.pop();
    		}
    	}
    	return stack.empty();
    }
}
