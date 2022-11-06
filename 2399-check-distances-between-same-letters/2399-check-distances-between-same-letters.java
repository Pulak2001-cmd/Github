class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){ 
                List<Integer> l = map.get(s.charAt(i));
                l.add(i);
                map.put(s.charAt(i), l);
            } else {
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                map.put(s.charAt(i), l);
            }
        }
        for (Map.Entry<Character, List<Integer>> mE : map.entrySet()) {
            Character c = mE.getKey();
            List<Integer> index = mE.getValue();
            int x = c - 'a';
            System.out.println(x);
            int diff = index.get(1) - index.get(0);
            if (diff-1 != distance[x]){
                return false;
            }
        }
        return true;
    }
}