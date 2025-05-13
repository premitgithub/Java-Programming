package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Matrix_GFG {
    public static int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                list.add(Mat[i][j]);
            }
        }
        Collections.sort(list);
        int k=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j]=list.get(k);
                k++;
            }
        }

        return Mat;
    }
    public static void main(String[] args) {
        int[][] Mat={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(Arrays.deepToString(sortedMatrix(4, Mat)));
    }
}
