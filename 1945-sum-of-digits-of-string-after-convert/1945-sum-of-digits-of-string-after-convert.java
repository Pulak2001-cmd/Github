class Solution {
    public int getLucky(String s, int k) {
        String x = "";
        for(int i=0;i<s.length();i++){
            int j = s.charAt(i)-96;
            x += j;
        }
        System.out.println(x);
        for(int i=0;i<k;i++){
            int ans = 0;
            for(int m=0;m<x.length();m++){
                ans += x.charAt(m) - '0';
            }
            x = Integer.toString(ans);
        }
        return Integer.parseInt(x);
    }
}