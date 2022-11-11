class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }
        Set<Integer> st = new HashSet<>();
        for (Map.Entry<Character,Integer> mapElement : mp.entrySet()) {
            int value = mapElement.getValue();
            st.add(value);
        }
        return st.size() == 1;
    }
}