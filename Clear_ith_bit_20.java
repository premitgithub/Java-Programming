package Bit_Manipulation;

public class Clear_ith_bit_20
{
    public static void main(String[] args)
    {
        int i=1,bitMask=(~(1<<i)),n=10;
        System.out.println(n&bitMask);
    }
}
