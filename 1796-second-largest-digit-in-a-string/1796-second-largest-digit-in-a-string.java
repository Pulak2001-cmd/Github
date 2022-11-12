class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> l =new TreeSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                l.add(s.charAt(i)-'0');
            }
        }
        if(l.size() == 0 || l.size() == 1) return -1;
        else {
            int last = l.last();
            l.remove(last);
            return l.last();
        }
    }
}