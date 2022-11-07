class Solution {
    public int countEven(int num) {
        int i=1;
        int count = 0;
        while(i <= num){
            if(digitSum(i) %2 ==0) count++;
            i++;
        }
        return count;
    }
    public int digitSum(int n){
        int ans = 0;
        while(n!= 0){
            ans += n%10;
            n = n/10;
        }
        System.out.println(ans);
        return ans;
    }
}