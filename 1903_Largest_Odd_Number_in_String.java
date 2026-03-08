class Solution {
    public String largestOddNumber(String num) {
        int ind=num.length()-1;
        String s=new String();
        while(ind>=0){
            char cur=num.charAt(ind);
            if(cur=='1' || cur=='3' || cur=='5' || cur=='7' || cur=='9'){
                s=num.substring(0,ind+1);
                break;
            }
            ind--;
        }
        return s;
    }
}