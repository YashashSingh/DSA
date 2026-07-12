class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n =nums.length;
        int low=0,sum=0;
        int ans=Integer.MAX_VALUE;
        for(int high=0;high<n;high++){
            sum=sum+nums[high];
            while(sum>=target){
                ans=Math.min(ans,high-low+1);
                sum=sum-nums[low];
                low++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}