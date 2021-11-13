package GeneralProblems;

import java.util.Scanner;

public class WiproQ3 {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        
        int sum = 0;
        while (counter < N) {
  
            // Print the number
            sum += num1;
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        // Given Number N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
  
        // Function Call
        Fibonacci(N);
        sc.close();
    }
}
