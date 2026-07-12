class Solution{
    public int reverseDegree(String s){
        int ans=0;
        int idx=1;
        for(char c:s.toCharArray()){
            ans+=(123-(int)c)*idx;
            idx++;
        }


        return ans;
    }
}