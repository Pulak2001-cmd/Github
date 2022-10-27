class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int windowSum = 0;
        for(int i=0; i<nums.length; i++){
            windowSum += nums[i];
            if(i >= k - 1){
                max = Math.max(max, windowSum);
                windowSum -= nums[i - (k - 1)];
            }
        }
        return (double) max/k; 
    }
}