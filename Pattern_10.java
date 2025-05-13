package Patterns;/*
     *
    * *
   * * *
  * * * *
 * * * * *

 */
import java.util.Scanner;

public class Pattern_10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
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
