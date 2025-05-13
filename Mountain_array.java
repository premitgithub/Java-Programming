package Binary_Search;

import java.util.*;
public class Mountain_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element;
        int[] arr = {1, 2, 4, 7, 8, 5, 4, 3, 2, 1};
        System.out.println("Enter the target element");
        element = sc.nextInt();
        System.out.println("Peak element is = " + Min_index(arr,element));
    }

    public static int Min_index(int[] arr,int element)
    {
        int s1=0;
        int e1=search(arr);
        int a=-1;
        for(int i=s1;i<=e1;i++)
        {
            int mid=s1+(e1-s1)/2;
            if(arr[mid]==element)
            {
               a=mid;
            }
            if(arr[mid]>element)
            {
                e1=mid-1;
            }
            else
            {
                s1=mid+1;
            }
        }
        int s2=search(arr) + 1;
        int e2=arr.length - 1;
        if(a==-1)
        {
            for(int i=s2;i<=e2;i++)
            {
                int mid=s2+(e2-s2)/2;
                if(arr[mid]==element)
                {
                    a=mid;
                }
                if(arr[mid]<element)
                {
                    e2=mid-1;
                }
                else
                {
                    s2=mid+1;
                }
            }
        }
        return a;
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
                return mid;
            }
        }
        return -1;
    }
}
