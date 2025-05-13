package Recursion;

public class Last_occurence_22
{
    public static void main(String[] args) {
        int[] arr={10,10,10,10,1010,10,10};
        int key=10,i=arr.length-1;
        System.out.println(find(arr,key,i));
    }
    public static int find(int[] arr,int key,int i)
    {
        if(i==0)
            return -1;
        if(arr[i]==key)
            return (i);
        else
            return find(arr,key,i-1);
    }
}
