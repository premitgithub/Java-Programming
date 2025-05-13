import java.util.Arrays;
import java.util.Stack;

public class Move_negative_to_End_GFG {
    public static void segregateElements(int[] arr){
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int count=0;
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] >= 0) {
                s1.add(arr[i]);
            } else {
                s2.add(arr[i]);
                count++;
            }
        }
        for(int i=0;i<arr.length-count;i++){
                arr[i]=s1.pop();
        }
        for(int i=arr.length-count;i<arr.length;i++){
            arr[i]=s2.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={-5, 7, -3, -4, 9, 0, 10, -1, 11};
        segregateElements(arr);
    }
}
