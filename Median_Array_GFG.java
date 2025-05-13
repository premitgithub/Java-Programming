package Arrays;

import java.util.Arrays;

public class Median_Array_GFG {
    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        double median;
        int mid=arr.length/2;
        if(arr.length%2==0){
            median=(arr[mid-1]+arr[mid])/2.0;
        }
        else{
            median=arr[mid];
        }
        return median;
    }
    public static void main(String[] args) {
        int[] arr={56, 67, 30, 79};
        System.out.println(findMedian(arr));
    }
}
