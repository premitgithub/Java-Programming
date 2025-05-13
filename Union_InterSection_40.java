package Hashing;

import java.util.HashSet;

// Take two arrays and store them in a hashset to get the union and then store the first array in a hashet
// and then check whther array 2 elements are present. If  yes then increase the count and remove that element

public class Union_InterSection_40 
{
    public static void main(String[] args) 
    {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }
        System.out.println("Union has " + set.size() + " elements = " + set);

        set.clear();
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        int count = 0;
        System.out.print("[ ");
         for(int i=0;i<arr2.length;i++)
         {
             if (set.contains(arr2[i]))
             {
                 set.remove(arr2[i]);
                 count++;
                 System.out.print(arr2[i]+" ");
             }
         }
        System.out.print("] are the intersection elements with size =  " + count);
    }    
}
