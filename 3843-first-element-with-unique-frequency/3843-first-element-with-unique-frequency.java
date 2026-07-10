class Solution {
    public int firstUniqueFreq(int[] nums) {
    int[] freq = new int[100001];
    for (int num : nums) {
        freq[num]++;
    }
    int[] freqCount = new int[100001];
    for (int f : freq) {
        if (f > 0){
            freqCount[f]++;
            }
        }
        for(int num:nums){
            if(freqCount[freq[num]]==1){
                return num;
            }
        }
        return -1;
    }
}