class Solution {
    public boolean isThree(int n) {
        int half = n/2;
        int count = 1;
        for(int i=1;i<=half;i++){
            if(n%i == 0){
                if(count == 3) return false;
                else{
                    count++;
                }
            }
        }
        System.out.print(count);
        return (count == 3);
    }
}