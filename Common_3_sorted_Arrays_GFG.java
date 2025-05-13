package Arrays;

import java.util.*;

public class Common_3_sorted_Arrays_GFG {
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Mark all the elements in the first array with
        // value=1
        for (int ele : arr1) {
            map.put(ele, 1);
        }

        // Mark all the elements which are common in first
        // and second array with value = 2
        for (int ele : arr2) {
            if (map.containsKey(ele) && map.get(ele) == 1)
                map.put(ele, 2);
        }

        // Mark all the elements which are common in first,
        // second, and third array with value = 3
        for (int ele : arr3) {
            if (map.containsKey(ele) && map.get(ele) == 2)
                map.put(ele, 3);
        }

        // Store all the common elements
        ArrayList<Integer> commonElements
            = new ArrayList<>();
        for (int ele : map.keySet()) {
            if (map.get(ele) == 3)
                commonElements.add(ele);
        }

        // Return the common elements which are common in
        // all the three arrays
        return commonElements;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        int[] first={1, 5, 10, 20, 40, 80};
        for (int j : first) {
            arr1.add(j);
        }
        int[] second = {6, 7, 20, 80, 100};
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int j : second) {
            arr2.add(j);
        }
        int[] third = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> arr3=new ArrayList<>();
        for (int j : third) {
            arr3.add(j);
        }
        System.out.println(commonElements(arr1,arr2,arr3));
    }
}
