package Bit_Manipulation;

public class Get_ith_bit_20
{
    public static void main(String[] args)
    {
        int i=3,bitMask=1<<i,n=9;
        if((n&bitMask) == 0)
        {
            System.out.println("Ith bit is 0");
        }
        else
        {
            System.out.println("Ith bit is 1");
        }
    }
}
