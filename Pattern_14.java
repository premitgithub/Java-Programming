package Patterns;

/*
 *********
  *     *
   *   *
    * *
     *
*/
public class Pattern_14
{
    public static void main(String[] args)
    {
        int n=5;
        int var = n + n - 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=var;k>=1;k--)
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
            var-=2;
        }
    }
}
