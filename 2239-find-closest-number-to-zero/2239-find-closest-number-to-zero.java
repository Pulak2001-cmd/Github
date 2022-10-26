class Solution {
    public int findClosestNumber(int[] nums) {
        int diff = Integer.MAX_VALUE;
        int ans = nums[0];
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i] - 0) < diff){
                diff = Math.abs(nums[i]-0);
                ans = nums[i];
            } else if(Math.abs(nums[i] - 0) == diff){
                if(nums[i] > ans){
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}