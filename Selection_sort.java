package Sorting;

import java.util.*;
public class Selection_sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={9,2,7,3,0,13,5,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        int max,temp,last=0;
        for(int i=0;i<arr.length;i++)
        {
            max=0;
            for(int j=0;j<=arr.length-i-1;j++)
            {
                if(arr[j]>=arr[max])
                {
                    max=j;
                    last=arr.length-i-1;
                }
            }
            temp=arr[last];
            arr[last]=arr[max];
            arr[max]=temp;
        }
    }
}
