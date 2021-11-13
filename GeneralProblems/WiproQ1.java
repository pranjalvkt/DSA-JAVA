package GeneralProblems;

import java.util.Scanner;

public class WiproQ1 { // class ka name jo pehle se likha hai wahi likhe rehne dena
    public static void main(String[] args) { //main function poora copy karlo
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            
            if(!isPrime(temp)) {
                sum = sum + temp;

            } 
            num = num / 10;
        }
        System.out.println(sum);
        sc.close();
    }
    static boolean isPrime(int n) // ye function poora ka poora copy karlo
    {
        // Corner cases
        if (n <= 3)
            return true;
  
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
    }
}
