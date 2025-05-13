package Matrix;

import java.util.Arrays;

public class Rotate_90_degree_GFG {
    public static void rotate(int mat[][]) {
        // Code Here
        for(int i=0;i<mat.length;i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            int start=0;
            int end = mat[0].length-1;
            for(int j=0;j<mat[0].length;j++){
                if(start<=end){
                    int temp = mat[i][start];
                    mat[i][start]=mat[i][end];
                    mat[i][end] = temp;
                    start++;
                    end--;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
    public static void main(String[] args) {
        int[][] mat= {{1 }};
        rotate(mat);
    }
}
