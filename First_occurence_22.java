package Recursion;

public class First_occurence_22
{
    public static void main(String[] args) {
        int[] arr={8,3,6,5,4,2,5,7,9,5,11};
        int key=9,i=0;
        System.out.println(find(arr,key,i));
    }
    public static int find(int[] arr,int key,int i)
    {
        if(i== arr.length-1)
            return -1;
        if(arr[i]==key)
            return i;
        else
            return find(arr,key,i+1);
    }
}
