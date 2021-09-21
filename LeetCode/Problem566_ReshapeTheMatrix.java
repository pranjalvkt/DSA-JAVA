package LeetCode;

public class Problem566_ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r * c != mat.length * mat[0].length) {
            return mat;
        } 
        int[][] reshape = new int[r][c];
        
        int newR = 0;
        int newC = 0;
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                reshape[newR][newC++] = mat[i][j];
                if(newC == c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return reshape;
    }
}
