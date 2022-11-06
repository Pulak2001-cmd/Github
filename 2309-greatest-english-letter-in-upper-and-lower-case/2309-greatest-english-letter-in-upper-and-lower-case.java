class Solution {
    public String greatestLetter(String s) {
        int[] small = new int[26];
        int[] big = new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a' <= 26 && s.charAt(i) - 'a' >= 0){
                small[s.charAt(i)-'a'] += 1;
            } else if(s.charAt(i)-'A' <= 26){
                big[s.charAt(i)-'A'] += 1;
            }
        }
        String ans = "";
        for(int i=0;i<26;i++){
            if(small[i] >= 1 && big[i] >= 1) ans = ""+(char)(i+65);
        }
        return ans;
    }
}