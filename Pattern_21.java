/*
     *****
    *   *
   *   *
  *   *
 *****
 */
package Patterns;

public class Pattern_21
{
        public static void main(String[] args)
        {
            int n=5;
            for(int i=1 ; i<=n ; i++)
            {
                for(int j=n-i ; j>0 ; j--)
                {
                    System.out.print(" ");
                }
                for(int j=1 ; j<=n ; j++)
                {
                    if(i>1 && i<n)
                    {
                        if(j==1 || j==n)
                        {
                            System.out.print("*");
                        }else
                        {
                            System.out.print(" ");
                        }
                    }
                    else{
                        System.out.print("*");
                    }

                }
                System.out.println();
            }
        }
    }
