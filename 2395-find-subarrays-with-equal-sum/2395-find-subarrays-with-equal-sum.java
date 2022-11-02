class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 1; i < nums.length; i++){
            if(!s.add(nums[i] + nums[i-1]))
                return true;
        }
        return false;
    }
}