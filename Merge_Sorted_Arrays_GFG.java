import java.util.Arrays;

public class Merge_Sorted_Arrays_GFG {
    public static void mergeArrays(int[] a, int[] b) {
        
        a = Arrays.copyOf(a, a.length + b.length);
        int x=0;
        for (int i = a.length - b.length; i < a.length; i++) {
            a[i] = b[x];
            x++;
        }
        b = Arrays.copyOf(b, 0);
        Arrays.sort(a);
    }
    public static void main(String[] args) {
        int[] a = { 1 ,3 ,5 ,7 };
        int[] b = { 0 ,2 ,6 ,8 ,9 };
        mergeArrays(a, b);
        System.out.println(Arrays.toString(a));
    }
}
