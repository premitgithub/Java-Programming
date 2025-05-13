import java.util.Arrays;

public class Minimize_max_Diff_between_Heights_GFG {
    public static int getMinDiff(int[] arr, int k) {
        // code here
        if(arr.length==1){
            return 0;
        }
        Arrays.sort(arr);
        int minDiff = arr[arr.length-1]- arr[0];
        int min , max;
        // smallest = arr[0]
        //largest = arr[n-1]
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0){
                continue;
            }
            min = Math.min(arr[0]+k, arr[i]-k);
            max = Math.max(arr[arr.length-1]-k, arr[i-1]+k);

            minDiff = Math.min(minDiff,max-min);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] heights={1};
        System.out.println(getMinDiff(heights,2));
    }
}
