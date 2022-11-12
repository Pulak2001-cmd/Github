class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer> intervals = new ArrayList<>();
        for(int i=left;i<=right;i++){
            intervals.add(i);
        }
        for(int i=0;i<ranges.length;i++){
            for(int j = ranges[i][0];j<=ranges[i][1];j++){
                if (intervals.contains(j)){
                    intervals.remove(Integer.valueOf(j));
                }
            }
        }
        return intervals.size() == 0;
    }
}