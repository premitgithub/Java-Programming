package Divide_and_Conquer;

import java.util.Arrays;

public class Quick_Sort_24
{
    public static void main(String[] args)
    {
        int[] arr={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);//for left sorting
        quickSort(arr,pIdx+1,ei);//for right sorting
    }
    public static int partition(int[] arr,int si,int ei)
    {
        int i=si-1,temp;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++)

        {
            if(arr[j]<=pivot)
            {
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
