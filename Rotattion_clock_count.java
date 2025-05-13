package Binary_Search;

import java.util.*;
public class Rotattion_clock_count
{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,0,1};
        int count;

        int pivot=pivot_index(arr);
        count=(arr.length-1)-(pivot);

        System.out.println(count);
    }

    public static int pivot_index(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        for(int i=start;start<end;i++)
        {

            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            else if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            else if(arr[start]<arr[mid])
            {
                start=mid+1;
            }
        }
        return arr.length-1;
    }
}
