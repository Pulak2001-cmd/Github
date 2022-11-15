class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return lps(dp, 0, n-1, s.toCharArray());
    }
    public int lps(int[][] dp, int i, int j, char[] str){
        if(i==j){
            return dp[i][j] = 1;
        } 
        if(str[i] == str[j] && i+1 == j){
            return dp[i][j] = 2;
        }
        if(dp[i][j] != -1){
          return dp[i][j];
        }
        if (str[i] == str[j]) {
            return dp[i][j] = lps(dp, i + 1, j - 1, str) + 2;
        }
        return dp[i][j] = Math.max(lps(dp, i, j - 1, str), lps(dp, i + 1, j, str));
    }
}