package Patterns;

/*

       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *


 */
public class Pattern_15
{
    public static void main(String[] args)
    {
        int n=7,var=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=var;k++)
            {
                if(k==1 || k==var)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            var+=2;
        }
        int var1 = n + n - 2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=var1;k>=1;k--)
            {
                if(k==2 || k==var1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            var1-=2;
        }
    }

}


