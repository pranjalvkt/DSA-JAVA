package CodeChef;

import java.util.Scanner;

public class HS08TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
		double Y = sc.nextDouble();

        if(X%5 == 0 && Y>= X+0.5)
		{
		    Y = Y-X-0.5;
		}
		System.out.printf("%.2f", Y);
        sc.close();
    }
}
