class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        for(int i=0;i<brackets.length;i++){
            if(i == 0){
                if(income > brackets[i][0]){
                income -= brackets[i][0];
                tax += (double) (brackets[i][0]*brackets[i][1])/100;
                } else {
                    tax += (double)(income*brackets[i][1])/100;
                    break;
                }
            } else {
                if(income > brackets[i][0]-brackets[i-1][0]){
                income -= (brackets[i][0]-brackets[i-1][0]);
                tax += (double) ((brackets[i][0]-brackets[i-1][0])*brackets[i][1])/100;
                } else {
                    tax += (double)(income*brackets[i][1])/100;
                    break;
                }
            }
        }
        return tax;
    }
}