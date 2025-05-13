package Patterns;

public class Pattern_12
{
    public static void main(String[] args)
    {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-i+1;k>=1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
