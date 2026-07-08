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
        int ans[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans[i]=digRange(nums[i]);
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            if(ans[i]==max){
                list.add(nums[i]);
            }
        }
        int a=0;
        for(int i=0;i<list.size();i++){
            a+=list.get(i);
        }
        return a;
    }
}