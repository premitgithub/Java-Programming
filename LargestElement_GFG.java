public class LargestElement_GFG {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -5,-1,-6,-8,-22,0};
        System.out.println(largest(arr));
    }
}
