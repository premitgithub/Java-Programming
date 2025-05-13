package Recursion;

public class X_power_n_22
{
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(power(x,n));
    }
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return x*power(x,n-1);
        }
    }
}
