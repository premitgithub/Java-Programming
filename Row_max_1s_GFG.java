package Matrix;

import java.util.HashMap;

public class Row_max_1s_GFG {
    public static int rowWithMax1s(int arr[][]) {
        // code here
        int count=0,maxCount=0,maxIndex=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                maxIndex=i;
            }
            count=0;
            //System.out.println(map.get(maxCount));
        }

        return maxIndex;
    }
    public static void main(String[] args) {
        int[][] arr= {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0},{1,1,1,1}};
        //int[][] arr={{0,0},{0,0}};
        System.out.println(rowWithMax1s(arr));
    }
}
