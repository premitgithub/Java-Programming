package Hashing;

import java.util.HashMap;

public class Largest_Subarray_sum_40 
{
    public static void main(String[] args) 
    {
        // sum(0,j) - sum(o,i) = sum(i+1,j)
        int[] arr = { 15, -2, 2, -8, 1, 7, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum,idx)

        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++)
        {
            sum += arr[j];
            if(map.containsKey(sum))
            {
                len=Math.max(len, j-map.get(sum));// compares and calculates the length of max subarray
            }
            else
            {
                map.put(sum,j);
            }
        }
        System.out.println("Max subarray length with sum as 0 = "+len);
    }    
}
