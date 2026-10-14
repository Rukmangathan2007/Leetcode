class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        while(sum>9){
            sb.append('9');
            sum-=9;
        }

        if(sum>0)sb.append(String.valueOf(sum));

        int len=sb.length();
        if(len>num)return "";
        while(len<num){
            sb.append('0');
            len++;
        }

        return sb.toString();
    }
}