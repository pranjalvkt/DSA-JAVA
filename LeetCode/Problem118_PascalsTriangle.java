package LeetCode;
import java.util.*;

public class Problem118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> arr = new ArrayList<>();
        if(numRows == 0) return arr;
        
        for(int i = 0; i < numRows; i++) {
            int icj = 1;
            List<Integer> newRow = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                
                newRow.add(icj);
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            arr.add(newRow);
        }
        return arr;
    }
}
