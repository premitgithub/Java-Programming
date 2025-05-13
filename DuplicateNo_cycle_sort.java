package Sorting;

import java.util.*;
public class DuplicateNo_cycle_sort
{
    public static void main(String[] args)
    {
        int[] arr={3,3,3,3,3};
        System.out.println(sort(arr));
    }
    public static int sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                if(arr[i]==arr[arr[i]-1])
                {
                    return arr[i];
                }
                else
                {
                    int temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                    i--;
                }
            }

        }
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=arr[arr[i]+1];j<arr.length;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    return arr[j];
//                }
//            }
//        }
        return -1;
    }
}
