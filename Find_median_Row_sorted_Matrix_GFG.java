package Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class Find_median_Row_sorted_Matrix_GFG {
    public static int median(int[][] mat){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        int mid = list.size()/2;
        return list.get(mid);
    }

    public static void main(String[] args) {
        int[][] mat={{1}, {2}, {3}};
        System.out.println(median(mat));
    }
}
