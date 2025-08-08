/*509. Fibonacci Number
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
*/
import java.util.Arrays;
public   class fibonacci {
     public static int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public static  int helper(int n, int dp[]){
        if(n<=1){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fib(n-1)+fib(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int result = fib(n);
        System.out.println(result);

    }
}