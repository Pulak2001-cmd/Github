class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        List<Character> ch = new ArrayList<>();
        for(int i=0;i<chars.length();i++){
            ch.add(chars.charAt(i));
        }
        for(String s:words){
            List<Character> temp = new ArrayList<>(ch);
            boolean flag = true;
            for(int i=0;i<s.length();i++){
                if(temp.contains(s.charAt(i))){
                    temp.remove(Character.valueOf(s.charAt(i)));
                } else {
                    flag = false;
                }
            }
            if (flag) ans += s.length();
        }
        return ans;
    }
}