package Sorting;

import java.util.*;
public class Cycle_sort_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,1,2,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            //index=i+1;
            if(arr[i]!=i+1)
            {
                temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i--;
                //continue;
            }


        }
    }
}
