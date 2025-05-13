package Sorting;

import java.util.*;
public class Set_mismatch
{
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] arr1=match(arr);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] match(int[] arr)
    {
        int[] arr1=new int[2];
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
            {
                arr1[0]=arr[i];
                arr1[1]=i+1;
            }
        }
        return arr1;
    }
}
