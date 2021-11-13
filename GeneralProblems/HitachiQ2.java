package GeneralProblems;

import java.util.*;

public class HitachiQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if((arr[i] >= 0 && arr[i] <= arr[ele]) || (arr[i] < 0 && arr[i] > arr[ele])) {
                ele = i;
            }
        }
        System.out.println(arr[ele]);
        sc.close();
    }
}
