class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        int maxi=-1;
        long current;
        for(int k:set){
            count=1;
            current=k;
            while(true){
                long square=current*current;
                if(square>Integer.MAX_VALUE) break;
                if(!set.contains((int)square)) break;
                current=square;
                count++;
                maxi=Math.max(maxi,count);
            }
        }
        if(maxi==1) return -1;
        return maxi;
    }
}