package Bit_Manipulation;

public class Count_set_bits_20
{
    public static void main(String[] args)
    {
        System.out.println(count(15));
    }
    public static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
