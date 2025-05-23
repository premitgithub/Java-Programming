package Divide_and_Conquer;

import java.util.Arrays;

public class Merge_Sort_24
{
    public static void main(String[] args)
    {
        int[] arr={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int si,int ei)//to divide and sort the elements separately
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si,int ei,int mid)
    {
        int i=si;
        int j=mid+1;
        int k=0;
        int[] temp=new int[ei-si+1];
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
}
