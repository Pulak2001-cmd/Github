class Solution {
    public String convertToTitle(int columnNumber) {
        String s ="";
        while(columnNumber > 0){
            int t = (columnNumber-1) % 26;
            s += (char)('A'+t);
            columnNumber = (columnNumber-1)/26;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}