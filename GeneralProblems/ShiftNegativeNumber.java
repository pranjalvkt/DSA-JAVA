package GeneralProblems;
/*
*   @author
*   Pranjal Tripathi
*/

import java.util.*;

class ShiftNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,3,-2,-4,4,5,-1,0,5,9,-3,-2};
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : arr) {
            list.add(integer);
        }
        shiftNegativeNum(list);
    }
    private static void shiftNegativeNum(ArrayList<Integer> list) {
        int n = list.size();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) < 0) {
                if (i != j) {
                    Collections.swap(list, i, j);
                }
                j++;
            }
        }
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}