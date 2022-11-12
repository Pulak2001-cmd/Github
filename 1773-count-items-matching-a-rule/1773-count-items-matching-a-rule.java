class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<items.size();i++){
            String type = items.get(i).get(0);
            String color = items.get(i).get(1);
            String name = items.get(i).get(2);
            System.out.println(type+" "+color);
            if(ruleKey.equals("type") && ruleValue.equals(type)){
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(color)){
                count ++;
            } else if (ruleKey.equals("name") && ruleValue.equals(name))  count++;
        }
        return count;
    }
}