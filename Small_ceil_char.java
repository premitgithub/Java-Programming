package Binary_Search;

import java.util.*;

public class Small_ceil_char
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        char element;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter the array elements in sorted form");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the element to be searched");
        element = sc.next().charAt(0);
        /*if((search(arr,size,element)))
            System.out.println("Element out of index");
        else*/
            System.out.println("Binary_Search.Binary_Search.Ceiling of the number is = "+(search(arr,size,element)));
    }
    public static char search(char[] arr,int size,char element)
    {
        int start=0,mid;
        char ceil=' ';
        int end=arr.length-1;
        for(int i=0;i<size;i++)
        {
            mid=(start-end)/2 + end;
            if(arr[mid]==element) {
                return arr[mid];
            }
            else if(arr[mid]>element) {
                end=mid-1;
                ceil=arr[mid];
            }
            else if(element>arr[arr.length-1])
            {
                return arr[0];
            }
            else {
                start=mid+1;
            }
        }
        return ceil;

    }
}


