package Binary_Search;

import java.util.*;

public class Floor
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size, element;
            System.out.println("Enter the size of the array");
            size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the array elements in sorted form");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be searched");
            element = sc.nextInt();
            if((search(arr,size,element))==0)
                System.out.println("Element out of index");
            else
                System.out.println("Binary_Search.Binary_Search.Floor of the number is = "+(search(arr,size,element)));
        }
        public static int search(int[] arr,int size,int element)
        {
            int start=0,mid,floor=0;
            int end=arr.length-1;
            for(int i=0;i<size;i++)
            {
                mid=(start-end)/2 + end;
                if(arr[mid]==element) {
                    return arr[mid];
                }
                else if(arr[mid]>element) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                    floor=arr[mid];
                }
            }
            return floor;

        }
    }




