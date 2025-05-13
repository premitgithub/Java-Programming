package Binary_Search;

import java.util.*;
public class Positon_infinite_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size, element;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the infinite array elements in sorted form");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        element = sc.nextInt();
        System.out.println("The element is found at "+(search(arr,element))+"th position");
    }
    public static int search(int[] arr,int element)
    {
        int var=-1,temp;
        int start=0,end=1;
        for(int j=0;j<end;j++)
        {
            for(int i=start;i<end;i++)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==element)
                {
                    var=mid+1;
                }
                else if(arr[mid]>element)
                {
                    end=mid-1;
                }
                else  {
                    start=mid+1;
                }
            }
            if(var==-1)
            {
                temp=end+1;
                end=end+(end-start+1)*2;
                start=temp;
            }
        }

        return var;
    }

//    public static int index(int[] arr,int element)
//    {
//        int start=0,end=1;
//        for(int i=0;i<end;i++)
//        {
//            if(arr[end]<element)
//            {
//                end=2*end;
//                start=end;
//                search(arr,start,end,element);
//            }
//        }
//        return search(arr,start,end,element);
//    }

}
