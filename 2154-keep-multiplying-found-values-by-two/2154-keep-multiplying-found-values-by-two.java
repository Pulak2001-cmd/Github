class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        if(binarySearch(nums, original)) return findFinalValue(nums, original*2);
        return original;
    }
    public boolean binarySearch(int[] nums, int target){
        int i=0;
        int l = nums.length-1;
        while(i<=l){
            int mid = i +(l-i)/2;
            if (nums[mid] == target) return true;
            else {
                if (nums[mid] < target){
                    i=mid+1;
                } else{
                    l = mid-1;
                }
            }
        }
        return false;
    }
}