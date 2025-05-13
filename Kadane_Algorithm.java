package Array;

public class Kadane_Algorithm {
    public static int maxSubarraySum(int[] arr) {
        int  currSum=0, maxSum=0,count=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(arr[i]<0){
                count++;
            }
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        if(count==arr.length){
            maxSum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxSum){
                    maxSum=arr[i];
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
