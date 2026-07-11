class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        int idx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]) continue;
            else{
                idx=i-1;
                break;
            }
        }
        return idx+1;
    }
}