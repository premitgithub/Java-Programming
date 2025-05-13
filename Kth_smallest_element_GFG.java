package Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class Kth_smallest_element_GFG {
    public static int kthSmallest(int[][]mat,int n,int k)
    {
        //code here.
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
    public static void main(String[] args) {
        int[][] mat={{10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50}};
        System.out.println(kthSmallest(mat,4,7));
    }
}
