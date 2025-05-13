package Linear_Search;

import java.util.*;
public class Linear_Search
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,element,c=0,var=0;
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        element=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==element) {
                c++;
                var=i+1;
            }
        }
        if(c==0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " +var+"th position");
    }
}
