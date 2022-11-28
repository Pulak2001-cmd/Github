class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int loser = matches[i][1];
            if(mp.containsKey(loser)){
                mp.put(loser, mp.get(loser)+1);
            } else {
                mp.put(loser, 1);
            }
            int winner = matches[i][0];
            if(!mp.containsKey(winner)){
                mp.put(winner, 0);
            }
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m: mp.entrySet()){
            if(m.getValue() == 0){
                l1.add(m.getKey());
            } else if(m.getValue() == 1){
                l2.add(m.getKey());
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(l1);
        Collections.sort(l2);
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}