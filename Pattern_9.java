package Patterns;

import java.util.Scanner;

public class Pattern_9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int var= n + n - 1;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=var;k>=1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
            var-=2;
        }
    }
}
