package Dynamic_Programming_DP;

public class Fibonacci_48_p1 {
    public static int fib(int n, int[] f) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {//if fib(n) has already been calculated
            return f[n];
        }
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static int fibtabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        } 
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        int[] f=new int[n+1];
        System.out.println(fib(n, f));
        System.out.println(fibtabulation(n));
    }
}
