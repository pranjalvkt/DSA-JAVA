package GeneralProblems;

import java.util.Scanner;

public class WiproQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] resArr = mincol(arr);
        for (int i = 0; i < resArr.length; i++) {
            System.out.print(resArr[i] + " ");
        }
        sc.close();
    }

    public static int[] mincol (int[][] n) {
        int[] result = new int[n[0].length];
        for( int i = 0 ; i < n[0].length ; i++ ) // changed to n --> n[0]
        {
            int min = n[0][i];
            for( int j = 1 ; j < n.length ; j++ ) // changed n[0] --> n
            {
                if( n[j][i] < min )
                {
                    min = n[j][i];
                }
            }
            result[i] = min;
        }
        return result;

    }
}
