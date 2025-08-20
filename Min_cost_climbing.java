/*746. Min Cost Climbing Stairs
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6. */
public class Min_cost_climbing {
    // top down approach
    //  public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return recur(n,cost,dp);
    // }
    public int recur(int n, int cost[], int dp[]){
        if(n==0 || n==1){
            dp[n] = 0;
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int onestep=cost[n-1]+recur(n-1,cost,dp);
        int twostep=cost[n-2]+recur(n-2,cost,dp);
        dp[n]=Math.min(onestep, twostep);
        return dp[n];
    }
    // bottom up approach
     public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int state=2;state<=n;state++){
            int twostep=cost[state-2]+dp[state-2];
            int onestep=cost[state-1]+dp[state-1];
            dp[state]=Math.min(onestep, twostep);
        }
        return dp[n];
    }
}
