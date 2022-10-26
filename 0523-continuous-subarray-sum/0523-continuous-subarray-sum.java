class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int prev = 0;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            curr += nums[i];
            if (s.contains(curr%k)){
                return true;
            }
            curr %= k;
            s.add(prev);
            prev = curr;
        }
        return false;
    }
}