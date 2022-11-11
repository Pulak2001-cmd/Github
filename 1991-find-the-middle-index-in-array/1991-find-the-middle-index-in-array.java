class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int left = 0;
        int right = 0;
        for(int i=0;i<nums.length;i++){
            right += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right -= nums[i];
            if(left == right) return i;
            left += nums[i];
        }
        return -1;
    }
}