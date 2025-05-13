package Patterns;

/*
     *
    * *
   *   *
  *     *
 *********
*/
public class Pattern_13
{
    public static void main(String[] args)
    {
        int n=5,var=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=var;k++)
            {
                if(k==1 || k==var || i==1)
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
    }
}
