package Recursion;
/*
Question 1 : For a given integer array of size N. You have to find all the occurrences
(indices) of a given element (Key) and print them. Use a recursive function to solve this
problem.
Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
Sample Output : 1 5 7 8
*/
public class Practice_Qs_01
{
    public static void main(String[] args)
    {
        int[] arr={3,2,4,5,6,2,7,2,2};
        int key=2,idx=0;
        find(arr,idx,key);
    }
    public static void find(int[] arr,int idx,int key)
    {
        if(idx==arr.length)
        {
            return ;
        }
        if(arr[idx]==key)
        {
            System.out.print(idx+" ");
        }
        find(arr,idx+1,key);
    }
}
