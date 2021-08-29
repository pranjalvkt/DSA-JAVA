package Recursion;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(2);
        stack.push(3);
        sortStack(stack);
        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
    public static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        insertOnRightPlace(stack, temp);
    }
    public static void insertOnRightPlace(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        
        insertOnRightPlace(stack, temp);
        stack.push(val);
    }
    
}