class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(divide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean divide(int n){
        int x = n;
        List<Integer> w = new ArrayList<>();
        while(x!=0){
            w.add(x%10);
            x=x/10;
        }
        if(w.contains(0)){
            return false;
        }
        for(int i=0;i<w.size();i++){
            System.out.println(w.get(i)+" "+n);
            if(n%w.get(i) != 0) return false;
        }
        return true;
    }
}