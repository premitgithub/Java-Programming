import java.util.HashMap;
import java.util.Map;

public class More_than_nbyk_Occurrences_GFG {
    public static int countOccurence(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int limit = arr.length / k;
        int count=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>limit){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 2, 1, 2, 3, 3 };
        System.out.println(countOccurence(arr, 4));
    }
}
