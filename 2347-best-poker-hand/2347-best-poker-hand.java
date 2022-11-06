class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Character> set=new HashSet<>();

        for(char c:suits){
            set.add(c);
        }

        if(set.size()==1){
            return "Flush";
        }

        int temp=0;
        for(int i=0;i<ranks.length;i++){
            if(map.containsKey(ranks[i])){
                int curr=map.get(ranks[i]);
                temp=Math.max(curr,temp);
            }

            map.put(ranks[i], map.getOrDefault(ranks[i],0)+1);
        }

        if(temp>=2){
            return "Three of a Kind";
        }else if(temp==1){
            return "Pair";
        }

        return "High Card";
    }
}