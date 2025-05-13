/*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
       */

package Patterns;

public class Pattern_16
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0 ; i<=n ; i++){
            for(int j=n-i ; j>=0 ; j--){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print(combination(i,j ) + " ");
            }
            System.out.println();
        }
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    static int combination( int n , int r) {
        int comb = 1;
        for (int i = 0; i <= r; i++) {
            comb = factorial(n) / (factorial(r) * factorial(n - r));
        }
        return comb;
    }
}

