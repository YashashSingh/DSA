class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String a = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                a=a+s.charAt(i);
            }
        }
        long sum=0;
        for(int i=0;i<a.length();i++){
            sum=sum+a.charAt(i)-'0';
        }
        if(a.length()==0) return 0;
        long ans = Long.parseLong(a);
        return ans*sum;
    }
}