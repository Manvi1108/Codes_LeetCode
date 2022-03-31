class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 1;
        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i])
                    max = Math.max(max,dp[j]);
            }
            dp[i] = max+1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}