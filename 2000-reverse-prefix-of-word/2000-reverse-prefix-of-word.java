class Solution {
    public String reversePrefix(String word, char ch) {
        int flag = 0;
        StringBuilder first = new StringBuilder();
        StringBuilder last = new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(flag == 0){
                if(word.charAt(i) == ch){
                    flag = 1;
                }
                first.append(word.charAt(i));
            } else {
                last.append(word.charAt(i));
            }
        }
        if(flag == 0){
            return word;
        }
        return first.reverse().toString()+last.toString();
    }
}