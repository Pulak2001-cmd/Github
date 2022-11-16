class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        for(int i=0;i<n;i++){
            String sub = s.substring(1, s.length());
            sub += s.charAt(0);
            s = sub;
            if(sub.equals(goal)) return true;
        }
        return false;
    }
}