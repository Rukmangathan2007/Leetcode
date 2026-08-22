class Solution {
    public boolean checkDivisibility(int n) {
        int t=n,sum=0,prod=1;
        while(t>0){
            sum+=t%10;
            prod*=t%10;
            t/=10;
        }
        return n%(sum+prod)==0?true:false;
    }
}