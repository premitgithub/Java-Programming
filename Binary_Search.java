package Binary_Search;

import java.util.*;

public class Binary_Search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, element,k;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements in sorted form");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        element = sc.nextInt();
        System.out.println("Element found at "+(search(arr,size,element))+"th position");
    }
    public static int search(int[] arr,int size,int element)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        for(int i=0;i<=end;i++)
        {
            mid=(start-end)/2 + end;
            if(arr[mid]<element)
                start=mid+1;
            else if(arr[mid]>element)
                end=mid-1;
            else if(arr[mid]==element)
            {
                return mid+1;
            }
        }
        return -1;

    }
}
