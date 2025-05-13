/*
       E D C B A
       D C B A
       C B A
       B A
       A

        */
package Patterns;

public class Pattern_27
{
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            int count = 65 + n - i;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) count);
                count--;
            }
            System.out.println();
        }
    }
}
