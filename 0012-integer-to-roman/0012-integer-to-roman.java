class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "I");
        mp.put(5, "V");
        mp.put(4, "IV");
        mp.put(10, "X");
        mp.put(9, "IX");
        mp.put(50, "L");
        mp.put(40, "XL");
        mp.put(100, "C");
        mp.put(90, "XC");
        mp.put(500, "D");
        mp.put(400, "CD");
        mp.put(1000, "M");
        mp.put(900, "CM");
        String ans = "";
        int[] nos = {1000, 900, 500, 400, 100, 90, 50, 40, 10 ,9, 5, 4, 1};
        for(int i=0;i<nos.length;i++){
            while (nos[i] <= num){
                ans += mp.get(nos[i]);
                num -= nos[i];
            }
        }
        return ans;
    }
}