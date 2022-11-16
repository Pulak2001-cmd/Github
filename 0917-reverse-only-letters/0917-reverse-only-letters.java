class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> alp = new ArrayList<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                alp.add(s.charAt(i));
            }
        }
        Collections.reverse(alp);
        int j = 0;
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i))){
                ans += s.charAt(i);
            } else {
                ans += alp.get(j);
                j++;
            }
        }
        return ans;
    }
}