import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_Duplicates_GFG {
    public static List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i =0 ; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> iteration:
        map.entrySet()) {
            if (iteration.getValue() > 1) {
                list.add(iteration.getKey());
            }
        }
       return list;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,2,3,9,0,1,9};
        System.out.println(findDuplicates(arr));
    }
}
