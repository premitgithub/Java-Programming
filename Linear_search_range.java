package Linear_Search;

import java.util.*;
public class Linear_search_range
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,size,item;
        System.out.println("Enter the size");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the starting range");
        a=sc.nextInt();
        System.out.println("Enter the ending range");
        b=sc.nextInt();
        System.out.println("Enter the element to be searched");
        item=sc.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Linear_Search(arr,item,a,b);
    }
    static void Linear_Search(int[] arr,int item,int a,int b)
    {
        for(int i=a;i<b;i++)
        {
            if(arr[i]==item) {
                System.out.println("Element found");
                break;
            }
            else
                continue;
        }
    }
}
