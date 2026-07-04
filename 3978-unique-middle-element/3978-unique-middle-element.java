class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        int middle = nums[n/2];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return map.get(middle)==1;
    }
}