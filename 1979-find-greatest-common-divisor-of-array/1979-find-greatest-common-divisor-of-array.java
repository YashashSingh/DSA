class Solution {
    public int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
        }
        return gcd(max,min);
    }
}