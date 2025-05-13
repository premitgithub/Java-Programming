package Backtracking;

//import java.util.ArrayList;
import java.util.Arrays;

public class Array_incrmt_by2_26
{
    public static void main(String[] args)
    {
        //program to decrease the value of the array elements by 2 while returning
        int[] arr=new int[5];
        changeArray(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArray(int[] arr,int i,int val)
    {
        if(i == arr.length)//base case
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i]=val;
        changeArray(arr,i+1,val+1);// function call step
        arr[i]=val-2;// backtracking step
    }
}
