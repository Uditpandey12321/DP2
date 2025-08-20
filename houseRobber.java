/*198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12. */



public class houseRobber {
    // //using recursion
    //  public int rob(int[] nums) {
    //     int n = nums.length;
    //     return recur(nums, n-1);
    // }
    // public int recur(int nums[], int i){
    //     if(i==0){
    //         return nums[0];
    //     }
    //     if(i == -1){
    //         return 0;
    //     }
    //     int pick = nums[i]+recur(nums,i-2);
    //     int nopick = 0+recur(nums,i-1);
    //     return Math.max(pick,nopick);
    // }
    // top down dp
    //  public int rob(int[] nums) {
    //     int n = nums.length;
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp, -1);
    //     return recur(nums, n, dp);
    // }
    // public int recur(int nums[], int i, int dp[]){
    //     if(i==1){
    //         dp[i]=nums[0];
    //         return nums[0];
    //     }
    //     if(i == 0){
    //         dp[i] = 0;
    //         return 0;
    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int pick = nums[i-1]+recur(nums,i-2,dp);
    //     int nopick = 0+recur(nums,i-1,dp);
    //     dp[i]= Math.max(pick,nopick);
    //     return dp[i];
    // }
    //using tabulation bottom up
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<n+1;i++){
        int pick = nums[i-1]+dp[i-2];
        int nopick = 0+dp[i-1];
        dp[i]= Math.max(pick,nopick);
        }
        return dp[n];
    }
}
