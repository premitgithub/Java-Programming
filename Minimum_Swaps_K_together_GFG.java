package Arrays;

public class Minimum_Swaps_K_together_GFG {
    public static int minSwap(int[] arr, int k) {
        // Complete the function
        int i=-1,count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=k){
                i++;
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2, 4, 5, 3, 6, 1, 8};
        System.out.println(minSwap(arr,6));
    }
}
