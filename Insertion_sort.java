package Sorting;

import java.util.*;
public class Insertion_sort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        int temp;
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
