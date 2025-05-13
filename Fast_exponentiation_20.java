package Bit_Manipulation;

public class Fast_exponentiation_20
{
    public static void main(String[] args)
    {
        System.out.println(expo(2,10));
    }
    public static int expo(int a, int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
}
