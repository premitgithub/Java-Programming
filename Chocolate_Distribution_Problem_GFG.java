package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution_Problem_GFG {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        if(arr.size()==0){
            return 0;
        }
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-m+1;i++){
            int min=arr.get(i);
            int max=arr.get(i+m-1);
            minDiff=Math.min(minDiff,max-min);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] array={3, 4, 1, 9, 56, 7, 9, 12};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            arr.add(array[i]);
        }
        System.out.println(findMinDiff(arr,5));
    }
}
