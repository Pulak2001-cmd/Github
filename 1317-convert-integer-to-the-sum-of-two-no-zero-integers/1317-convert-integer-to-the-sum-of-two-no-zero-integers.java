class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n<2){
            return new int[0];
        }
        int[] ans = new int[2];
        ans[0] = 1;
        ans[1] = n-1;
        String s = Integer.toString(ans[1]);
        String m = Integer.toString(ans[0]);
        while(s.contains("0") || m.contains("0")){
            ans[0]++;
            ans[1] = n-ans[0];
            s = Integer.toString(ans[1]);
            m = Integer.toString(ans[0]);
        }
        return ans;
    }
}