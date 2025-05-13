package Recursion;

public class Check_sorted_22
{
    public static void main(String[] args) {
        int[] arr={1,2,3,8,6};
        int i=0;
        System.out.println(checksort(arr,i));
    }
    public static boolean checksort(int[] arr, int i)
    {
        if(i==arr.length-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        else
            return checksort(arr,i+1);
    }
}
