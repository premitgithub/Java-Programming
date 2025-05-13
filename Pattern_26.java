/*

       a
       B c
       D e F
       g H i J
       k L m N o

        */
package Patterns;

public class Pattern_26
{
    public static void main(String[] args) {
        int n=5;
        int temp = 0;
        int count = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (temp == 0) {
                    System.out.print((char) (count + 32));
                    temp++;
                    count++;
                } else {
                    System.out.print((char) count);
                    count++;
                    temp--;
                }
            }
            System.out.println();
        }
    }
}
