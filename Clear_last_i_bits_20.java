package Bit_Manipulation;

public class Clear_last_i_bits_20
{
    public static void main(String[] args)
    {
        int n=15,i=4;
        System.out.println(clear_i_bit(n,i));
    }
    public static int clear_i_bit(int n, int i)
    {
        int bitMask=(-1)<<i;
        return n&bitMask;
    }
}
