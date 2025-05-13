package Bit_Manipulation;

public class Update_ith_bit_20
{
    public static void main(String[] args)
    {
        int n=10,i=2,newBit=1;
        System.out.println(updatebit(n,i,newBit));
    }
    public static int getbit(int n,int i)
    {
        int bitMask=1<<i;
        if((n&bitMask) == 0)
            return 0;
        else
            return 1;
    }
    public static int setbit(int n,int i)
    {
        int bitMask = 1 << i;
        return (n | bitMask);
    }
    public static int clearbit(int n,int i)
    {
        int bitMask = ~( 1 << i);
        return (n & bitMask);
    }
    public static int updatebit(int n,int i,int newBit)
    {
//        if(newBit==0)
//            return clearbit(n,i);
//        else
//            return setbit(n,i);
        n=clearbit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }

}
