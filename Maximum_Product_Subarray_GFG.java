package Arrays;

public class Maximum_Product_Subarray_GFG {
    public static int maxProduct(int[] arr) {
        // code here
        int maxProd=Integer.MIN_VALUE,prod=1;
        for(int i=0;i<arr.length-1;i++){
            prod=arr[i];
            for(int j=i+1;j<arr.length;j++){
                prod=prod*arr[j];
                maxProd=Math.max(maxProd,prod);
            }
        }
        return (arr.length==1)? arr[0]: maxProd;
    }
    public static void main(String[] args) {
        int[] arr={-2};
        System.out.println(maxProduct(arr));
    }
}
