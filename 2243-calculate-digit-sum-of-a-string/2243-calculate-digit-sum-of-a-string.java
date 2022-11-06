class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        String s1 = "";
        String[] srr = s.split("");
        int len = srr.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (count < k) {
                sum += Integer.parseInt(srr[i]);
                count ++;
            } else {
                s1 += sum;
                count = 1;
                sum = Integer.parseInt(srr[i]);
            }
        }
        s1 += sum;
        return digitSum(s1, k);
    }
}