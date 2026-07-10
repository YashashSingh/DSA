class Solution {
    public int fact(int num){
        if(num==1||num==0) return 1;
        return num*fact(num-1);
    }
    public boolean isDigitorialPermutation(int n) {
        String s = String.valueOf(n);
        int l=s.length();
        int ans=0;
        for(int i=0;i<l;i++){
            int digit=s.charAt(i)-'0';
            ans+=fact(digit);
        }

        String s1=String.valueOf(n);
        String s2=String.valueOf(ans);
        if(s1.length()!=s2.length()) return false;
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}