package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Array_Subset_GFG {
    public static boolean isSubset(int[] a,int[] b){
        ArrayList<Integer> list=new ArrayList<>();
        if(a.length<b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        int count=0;
        for(int i=0;i<b.length;i++){
            if(list.contains(b[i])){
                count++;
                list.remove((Integer) b[i]);
            }
        }
        if(count==b.length){
            return true;
        }
        return false;

        /* optimised code
         HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check if all elements of 'b' exist in 'a'
        for (int num : b) {
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) {
                return false;  // Element not found or exhausted
            }
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return true;
        */
    }
    public static void main(String[] args) {
        int[] a = {10, 5, 2, 23, 19};
        int[] b = {19,5,3};
        System.out.println(isSubset(a,b));
    }
}
