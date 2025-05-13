package Recursion;

public class Increasing_order_22
{
    public static void main(String[] args)
    {
        int n=5;
        asc(n);
    }
    public static void asc(int n) {
        if (n == 1)
        {
            System.out.print(n+" ");
        }
        else
        {
            asc(n-1);
            System.out.print(n+" ");
        }
    }
}
