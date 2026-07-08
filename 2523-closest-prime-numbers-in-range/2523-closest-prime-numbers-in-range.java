class Solution {
    public boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)) list.add(i);
        }
        int arr[]=new int[list.size()];
        if(list.size()<2){
            return new int[]{-1,-1};
        } 
        int minDiff = Integer.MAX_VALUE;
        int i=0,j=1;
        int ans[]=new int[2];
        while(j<list.size()){
            int diff = list.get(j)-list.get(i);
            if(diff<minDiff){
                minDiff=diff;
                ans[0]=list.get(i);
                ans[1]=list.get(j);
            }
            i++;
            j++;
        }
        return ans;
    }
}