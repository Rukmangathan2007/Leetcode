class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD=1000000007;
        int[] bit=new int[30];


        for(int x:nums){
            for (int b=0;b<30;b++){
                bit[b]+=x>>b&1;
            }
        }
            
        long res=0;
        for (int i=0;i<k;i++){
            long cur=0;
            for (int j=0; j<30;j++){
                if (bit[j]>0){
                    cur|=1L<<j;
                    bit[j]--;
                }
            }
            res=(res+cur*cur)%MOD;
        }
        return (int)res;
    }
}