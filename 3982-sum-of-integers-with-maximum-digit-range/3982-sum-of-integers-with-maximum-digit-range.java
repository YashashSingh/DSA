class Solution {
    public int digRange(int n){
        String s = String.valueOf(n);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'>max){
                max=s.charAt(i)-'0';
            }if(s.charAt(i)-'0'<min){
                min=s.charAt(i)-'0';
            }
        }
        int digitRange = max-min;
        return digitRange;
    }
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int range=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            range=digRange(nums[i]);
            if(range>max){
                max=range;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(digRange(nums[i])==max){
                sum+=nums[i];
            }
        }
        return sum;
    }
}