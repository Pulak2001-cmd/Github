class Solution {
    public int countAsterisks(String s) {
        int bar = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '|' && bar == 0){
                bar = 1;
            } else if(s.charAt(i) == '|' && bar == 1){
                bar = 0;
            }
            if(s.charAt(i) == '*' && bar == 0){
                count ++;
            }
        }
        return count;
    }
}