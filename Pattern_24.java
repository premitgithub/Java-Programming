/*
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4
         */
package Patterns;

public class Pattern_24
{
    public static void main(String[] args) {
        int n=5;
        int n1 = 2 * n;
        for (int i = 1; i <= n1; i++) {
            for (int j = n1; j > 0; j--) {
                int element = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
