package Hashing;
//Given an integer array of size n, find all elements that appear more than n/3 times

import java.util.*;

// nums[] = {1,3,2,5,1,3,1,5,1};

// ans = 1
// logic: num along with its frequency is stored in a hashmap and then compared with n/3

public class Majority_Element_40 
{
    public static void main(String[] args) 
    {
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     if (map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i]) + 1);/// when there is element present previously.. for upadation
        //     } else {
        //         map.put(nums[i], 1);// new element frequency=1
        //     }
        // }
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) 
        {
            if(map.get(key)>nums.length/3)
            {
                System.out.println(key);
            }
        }
    }
}
