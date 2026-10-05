class Solution {
    public int minAddToMakeValid(String s) {
        int h=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')h++;
            else h--;

            if(h==-1){
                h++;
                count++;
            }
        }

        return count+Math.abs(h);
    }
}