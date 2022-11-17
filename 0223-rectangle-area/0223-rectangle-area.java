class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int width1 = Math.abs(ax1-ax2);
        int height1 = Math.abs(ay1-ay2);
        int area1 = width1*height1;
        int width2 = Math.abs(bx1-bx2);
        int height2 = Math.abs(by1-by2);
        int area2 = width2*height2;
        int x=Math.min(ax2, bx2)-Math.max(ax1, bx1);
        int y=Math.min(ay2, by2)-Math.max(ay1, by1);
        int lap =x*y;
        if(x<0 || y<0){
            lap=0;
        }
        return (area1+area2-lap);
    }
}