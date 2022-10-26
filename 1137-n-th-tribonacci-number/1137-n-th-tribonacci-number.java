class Solution {
    Map<Integer, Integer> l = new HashMap<>();
    public int tribonacci(int n) {
        if (n == 0) {
            l.put(0, 0);
            return 0;
        }
        else if (n == 1){
            l.put(1, 1);
            return 1;  
        } 
        else if (n == 2){
            l.put(2, 1);
            return 1;
        } 
        else {
            int x1 = 0;
            if(l.containsKey(n-3)){
                x1 = l.get(n-3);
            } else {
                x1 = tribonacci(n-3);
                l.put(n-3, x1);
            }
            int x2 = 0;
            if(l.containsKey(n-2)){
                x2 = l.get(n-2);
            } else {
                x2 = tribonacci(n-2);
                l.put(n-2, x2);
            }
            int x3 = 0;
            if(l.containsKey(n-1)){
                x3 = l.get(n-1);
            } else {
                x3 = tribonacci(n-1);
                l.put(n-1, x3);
            }
            return x1+x2+x3;
        }
    }
}