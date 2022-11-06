class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        int count = 0;
        System.out.println(max+" "+min);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != min && nums[i] != max){
                System.out.println(nums[i]);
                count ++;
            }
        }
        return count;
    }
}