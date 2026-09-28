class Solution {
    public int maxDepth(String s) {
        int max=0;
        int cur=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                cur++;
                max=Math.max(max,cur);
            }
            if(ch==')')cur--;
        }

        return max;
    }
}