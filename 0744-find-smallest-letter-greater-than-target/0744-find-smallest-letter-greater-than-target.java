class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int tar = target - 'a';
        int max = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<letters.length;i++){
            int c = letters[i]-'a';
            if(c-tar == 0) continue;
            else if(c-tar < 0) continue;
            else if(c-tar < max){
                System.out.println(c-tar);
                max = c-tar;
                index = i;
            }
        }
        return index == -1 ? letters[0]:letters[index];
    }
}