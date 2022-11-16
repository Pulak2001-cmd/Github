class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            String curr=words[i];
            String next=words[i+1];
            for(int j=0;j<curr.length() && j<next.length();j++){
                int i1=order.indexOf(curr.charAt(j));
                int i2=order.indexOf(next.charAt(j));
                if(i1 < i2) break;
                else if(i1 == i2){
                    if(j == (int)Math.min(curr.length() -1,next.length()-1)){
                        if(curr.length() > next.length())    return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}