package Recursion;

public class Optimised_X_power_n_22
{
    public static void main(String[] args)
    {
        int n=5,x=2;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int var=power(x,n/2);
        if(n%2!=0)
        {
            return x * var * var;
        }
        return var*var;
    }
}
