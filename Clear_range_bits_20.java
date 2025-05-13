package Bit_Manipulation;

public class Clear_range_bits_20
{
    public static void main(String[] args)
    {
        int n=2512,i=2,j=7;
        System.out.println(clear_range_bit(n,i,j));
    }
    public static int clear_range_bit(int n,int i,int j)
    {
        int a=(-1)<<(j+1),b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }
}
