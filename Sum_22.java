package Recursion;

public class Sum_22
{
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        else
            return n+sum(n-1);
    }
}
