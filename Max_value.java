package Arrays;

import java.util.*;
public class Max_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,max;
        System.out.println("Enter the size");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("MAx value ="+max);
        }
    }

