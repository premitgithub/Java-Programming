/*

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */
package Patterns;

public class Pattern_19
{


        public static void main(String[] args)
        {
            int n=5,i=1;
            while(i<=n)
            {
                int j=1;
                while(j<=i)
                {
                    System.out.print("*");
                    j++;
                }
                j=n-i;
                while(j>=1)
                {
                    System.out.print(" ");
                    j--;
                }
                j=n-i;
                while(j>=1)
                {
                    System.out.print(" ");
                    j--;
                }
                j=1;
                while(j<=i)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
            i=1;
            while(i<=n)
            {
                int j=n-i;
                while(j>0)
                {
                    System.out.print("*");
                    j--;
                }
                j=1;
                while(j<=i)
                {
                    System.out.print(" ");
                    j++;
                }
                j=1;
                while(j<=i)
                {
                    System.out.print(" ");
                    j++;
                }
                j=n-i;
                while(j>0)
                {
                    System.out.print("*");
                    j--;
                }
                System.out.println();
                i++;

            }
        }
}
