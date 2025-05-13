package Binary_Search;

import java.util.*;
public class Peak_value
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,7,8,8,5,4,3,2,1};
        System.out.println("Peak element is = "+search(arr));
    }
    public static int search(int[] arr)
    {
        int start=0,end=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else if(arr[mid-1]>arr[mid])
            {
                end=mid-1;
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }

}
