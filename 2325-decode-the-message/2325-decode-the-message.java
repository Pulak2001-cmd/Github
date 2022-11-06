class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> m = new HashMap<>();
        int j = 0;
        for(int i=0;i<key.length();i++){
            if (m.containsKey(key.charAt(i))) continue;
            if (key.charAt(i) == ' ') continue;
            m.put(key.charAt(i), (char)(j+97));
            j ++;
        }
        String ans = "";
        for(int i=0;i<message.length();i++){
            if (message.charAt(i) == ' ') ans += ' ';
            else ans += m.get(message.charAt(i));
        }
        return ans;
    }
}