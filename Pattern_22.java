/*
1 2 3 4  17 18 19 20
  5 6 7  14 15 16
    8 9  12 13
     10  11
 */
package Patterns;

public class Pattern_22
{
        public static void main(String[] args)
        {
            int num=20,n=5,col=num/n,count=1,temp=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=n-i;j>0;j--)
                {
                    System.out.print(count);
                    count++;
                }
                temp=count;
                System.out.print(" ");
                for(int j=n-i;j>0;j--)
                {
                    if(i!=n-i)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(((num-temp)+2));
                    temp--;

                }
                System.out.println();
            }
        }
    }

