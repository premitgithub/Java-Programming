package Sorting;

import java.util.*;
public class Range_duplicate_cycle
{
    public static void main(String[] args) {
        int[] arr= {4,7,3,1,2,3,4,6,6,7};
        System.out.println(sort(arr));
    }
    public static ArrayList sort(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1 && arr[i]!=arr[arr[i]-1])
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
                list.add(arr[i]);
        }
        return list;
    }
}
