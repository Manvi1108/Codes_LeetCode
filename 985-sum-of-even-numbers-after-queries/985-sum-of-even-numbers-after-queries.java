class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] answer = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0)
            sum+=nums[i];
        }
        //System.out.println(sum);
        for(int i=0; i<n; i++){
            int idx = queries[i][1];
            if(nums[idx]%2==0){
                sum-=nums[idx];
            }
            nums[idx]+=queries[i][0];
            if(nums[idx]%2==0){
                sum+=nums[idx];
            }
            answer[i] = sum;
        }
        return answer;
    }
}