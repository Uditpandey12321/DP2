/*
 * 70. Climbing Stairs
 * You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
 */

import java.util.Arrays;

public class Climbing_Stairs {
    // using top down approach
    public static int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public static int helper(int n, int dp[]){
        if(n<=2) {
            dp[n] = n;
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = climbStairs(n-1)+climbStairs(n-2);
        return dp[n];
    }
    // using bottom up approach
    public static int climbStairsup(int n) {
        if(n<=2) {
            return n;
        }
        int dp[] = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int state=3;state<=n;state++){
            dp[state]=dp[state-1]+dp[state-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=2;
        int result = climbStairs(n);
        System.out.println(result);
    }
}
