package Patterns;

/*

 *
 **
 ***
 ****
 *****

*/
public class Pattern_6
{
    public static void main(String[] args)
    {
        int count=1;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
