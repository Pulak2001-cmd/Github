class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            l.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])){
                l.remove(Integer.valueOf(nums[i]));
            }
            if (s.contains(nums[i])){
                res[0] = nums[i];
            } else {
                s.add(nums[i]);
            }
        }
        res[1] = l.get(0);
        return res;
    }
}