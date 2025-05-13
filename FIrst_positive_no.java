package Arrays;

import java.util.*;
public class FIrst_positive_no
{
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(Find_first(arr));
    }
    public static int Find_first(int[] arr)
    {
        int val=arr.length + 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1 && arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[arr[i]-1])
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
                val = i+1;
                break;
            }
        }
        return val;
    }
}
