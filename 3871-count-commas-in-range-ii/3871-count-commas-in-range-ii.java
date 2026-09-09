class Solution {
    public long countCommas(long n) {
        long count=0,temp=n,pl=1000;
        while(temp>=1000){
            
            count+=n-pl+1;
            pl*=1000;
            temp/=1000;

        }
        return count;//10,000,000,000,000
    }
}