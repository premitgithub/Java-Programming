package Recursion;

public class Descending_order_22
{
    public static void main(String[] args)
    {
        int n=10;
        desc(n);
    }
    public static void desc(int n)
    {
        if(n==1)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(n+" ");
            desc(n-1);
        }
    }
}
