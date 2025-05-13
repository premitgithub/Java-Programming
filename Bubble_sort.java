package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,4,2,0,9,8,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
