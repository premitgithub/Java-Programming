package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

    public class Merge_Intervals_GFG {
        public static ArrayList<int[]> merge(int[][] arr) {
            ArrayList<int[]> list=new ArrayList<>();
            Arrays.sort(arr,Comparator.comparingDouble(o -> o[0]));
            int[] arr1=arr[0];

            for(int i=1;i< arr.length;i++){
                if(arr1[1]>arr[i][0]){
                    arr1[1]=Math.max(arr1[1],arr[i][1]);
                }
                else{
                    list.add(arr1);
                    arr1=arr[i];
                }
            }
            list.add(arr1);

            return list;
        }

        public static void main(String[] args) {
            int[][] intervals = {{1, 3}, {2, 4}, {6,8}, {9,10}};
            ArrayList<int[]> mergedIntervals = merge(intervals);

            // Print merged intervals
            for (int[] interval : mergedIntervals) {
                System.out.println(Arrays.toString(interval));
            }
        }
    }
