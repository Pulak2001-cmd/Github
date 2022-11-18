class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:arr){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int ans = -1;
        for(Map.Entry<Integer, Integer> m : mp.entrySet()){
            int key = m.getKey();
            int value = m.getValue();
            if(key == value){
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}