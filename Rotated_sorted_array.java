package Binary_Search;

import java.util.*;
public class Rotated_sorted_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int element;
        int[] arr={2,3,4,5,6,0,1};
        System.out.println("Enter the element to be searched");
        element=sc.nextInt();
        System.out.println("Element is found in "+ binary_search(arr,element) +"index");
    }

    public static int binary_search(int[] arr,int element)
    {
        int pivot=pivot_index(arr);
        int el;

        el=BinSear(arr,0,pivot+1,element);
        if(el==-1)
        {
            return BinSear(arr,(pivot+1),(arr.length-1),element);
        }
        else
            return el;


//        int start1=0;
//        int end1=pivot_index(arr);
//        int a=-1;
//        for(int i=0;i<=end1;i++)
//        {
//            int mid=start1+(end1-start1)/2;
//            if(arr[mid]==element)
//            {
//                a=mid+1;
//            }
//            else if(arr[mid]<element)
//            {
//                start1=mid+1;
//            }
//            else if(arr[mid]>element)
//            {
//                end1=mid-1;
//            }
//        }
//        if(a==-1)
//        {
//            int start2=pivot_index(arr)+1;
//            int end2=arr.length-1;
//            for(int i=start2;i<=end2;i++)
//            {
//                int mid2=start2+(end2-start2)/2;
//                if(arr[mid2]==element)
//                {
//                    a=mid2+1;
//                }
//                else if(arr[mid2]<element)
//                {
//                    start2=mid2+1;
//                }
//                else if(arr[mid2]>element)
//                {
//                    end2=mid2-1;
//                }
//            }
//        }


    }

    public static int BinSear(int[] arr,int start,int end,int element)
    {
        for(int i=start;i<=end;i++)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==element)
                {
                    return mid;
                }
                else if(arr[mid]<element)
                {
                    start=mid+1;
                }
                else if(arr[mid]>element)
                {
                    end=mid-1;
                }
            }
        return -1;
    }
    public static int pivot_index(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        for(int i=start;start<=end;i++)
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
        return -1;
    }
}
