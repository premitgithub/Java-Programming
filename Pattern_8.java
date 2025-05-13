package Patterns;/*
     *
    ***
   *****
  *******
 *********
***********
*/
import java.util.Scanner;

public class Pattern_8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int var=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=(n-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=var;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            var+=2;
        }
    }
}
