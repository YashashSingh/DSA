class Solution {
    public int countVowel(String c){
        int count=0;
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u') count++;
        }
        return count;
    }
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        int firstCount=countVowel(words[0]);
        for(int i=1;i<words.length;i++){
            int count=countVowel(words[i]);
            if(firstCount==count) words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }
}