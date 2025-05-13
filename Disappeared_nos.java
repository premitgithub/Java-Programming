package Sorting;

import java.util.*;
public class Disappeared_nos
{
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};

        System.out.println(sort(arr));
    }
    public static ArrayList<Integer> sort(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1 && arr[i]!=arr[arr[i]-1])
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
                i--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}
