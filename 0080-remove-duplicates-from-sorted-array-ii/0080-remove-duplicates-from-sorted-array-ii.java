class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                if(mp.get(nums[i]) <2){
                    count++;
                    mp.put(nums[i], mp.get(nums[i])+1);
                } else {
                    continue;
                }
            } else {
                mp.put(nums[i], 1);
                count++;
                l.add(nums[i]);
            }
        }
        
        int i=0;
        for(int j = 0;j<l.size();j++){
            int key = l.get(j);
            int value = mp.get(key);
            for(int k=0;k<value;k++){
                nums[i] = key;
                i++;
            }
        }
        return count;
    }
}