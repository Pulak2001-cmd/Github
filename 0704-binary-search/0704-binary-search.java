class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int n = nums.length-1;
        while(i<=n){
            int mid = i+(n-i)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                i = mid+1;
            } else {
                n = mid-1;
            }
        }
        return -1;
    }
}