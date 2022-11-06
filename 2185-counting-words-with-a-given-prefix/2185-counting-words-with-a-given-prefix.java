class Solution {
    public int prefixCount(String[] words, String pref) {
        int l = pref.length();
        int ans = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].length() < l) continue;
            System.out.println(words[i].substring(0, l));
            if(words[i].substring(0, l).equals(pref)) ans++;
        }
        return ans;
    }
}