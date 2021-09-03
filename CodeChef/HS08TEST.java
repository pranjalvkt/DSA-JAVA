package CodeChef;

import java.util.Scanner;

public class HS08TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(" ");
        for (String string : str) {
            System.out.println(string);
        }
        int toWithdraw = Integer.parseInt(str[0]);
        double initialBalance = Double.parseDouble(str[1]);

        if(toWithdraw % 5 != 0) System.out.println(initialBalance);
        else {
            if (toWithdraw > initialBalance) {
                System.out.println(initialBalance);
            }
            else {
                double newBalance = initialBalance - toWithdraw - 0.50;
                System.out.println(newBalance);
            }
        }
        sc.close();
    }
}
