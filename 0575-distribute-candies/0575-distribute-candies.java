class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            mp.put(candyType[i], mp.getOrDefault(candyType[i], 0)+1);
        }
        int max = candyType.length/2;
        int ans = 0;
        for (Map.Entry<Integer,Integer> mapElement : mp.entrySet()) {
            if(ans < max){
                ans++;
            } else {
                return ans;
            }
        }
        return ans;
    }
}