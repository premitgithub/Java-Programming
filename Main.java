package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size,temp;
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the first index");
        int id1=sc.nextInt();
        System.out.println("Enter the second index");
        int id2=sc.nextInt();
        System.out.println("Swapped values are");
        swap(arr,id1,id2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}