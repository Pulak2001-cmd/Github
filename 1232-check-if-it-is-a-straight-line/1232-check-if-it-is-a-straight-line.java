class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int points = coordinates.length;
        int a1 = (coordinates[1][0] - coordinates[0][0]);
        int b1 = (coordinates[1][1] - coordinates[0][1]);
        for(int i = 2; i < points; ++i){
            int c1 = (coordinates[i][0] - coordinates[i-1][0]);
            int d1 = (coordinates[i][1] - coordinates[i-1][1]);
            if(b1*c1 != a1*d1){
                return false;
            }
        }
        return true;
    }
}