class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<List<Integer>> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            int x = s.charAt(i)-'a';
            if(st.empty()){
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(1);
                st.push(l);
            } else if(st.peek().get(0) == x){
                int y = st.peek().get(1);
                if (y+1 == k){
                    st.pop();
                } else {
                    st.peek().set(1, y+1);
                }
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(x);
                l.add(1);
                st.push(l);
            }
        }
        String ans = "";
        while(!st.empty()){
            List<Integer> cur=st.pop();
      
            char currchar = (char)(cur.get(0)+97);
            int currfreq=cur.get(1);

            while(currfreq>0)
            {
                ans=ans+currchar;
                currfreq--;
            }
        }
        StringBuilder sb = new StringBuilder(ans);
        return sb.reverse().toString();
    }
}