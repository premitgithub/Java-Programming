/*
       E
       DE
       CDE
       BCDE
       ABCDE
        */
package Patterns;

public class Pattern_25
{
    public static void main(String[] args) {
        int n = 5;
        int count = 64 + n;
        for (int i = 0; i < n; i++) {
            count = count - i;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) count);
                count++;
            }
            count = 69;
            System.out.println();
        }
    }
}
