class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int max=-1;
        int key=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
            if(entry.getValue()==max && entry.getKey()<key){
                key=entry.getKey();
            }
        }
        return key;
    }
}