class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[]=new int[k];
        int idx=0;
        int max,key;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(k-->0){
            max=-1;
            key=-1;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    key=entry.getKey();
                }
            }
            ans[idx++]=key;
            map.remove(key);
        }
        return ans;
    }
}