package Bit_Manipulation;

public class Power_of_2_check_20
{
    public static void main(String[] args)
    {
        int n=8;
        if((n&(n-1))==0)
        {
            System.out.println("No is power of 2");
        }
        else
        {
            System.out.println("Not a power of 2");
        }
    }
}
