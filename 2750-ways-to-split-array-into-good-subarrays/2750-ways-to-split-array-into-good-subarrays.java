class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        List<Integer> lt=new ArrayList<>();
        int count=0;
        int MOD=1000000007;
        boolean is1=false;
        for(int i:nums){
            if(i==0){
                count++;
            }
            else{
                lt.add(count);
                count=0;
                is1=true;
            }
        }
        if(!is1)return 0;
        lt.remove(0);
        int N=lt.size();
        if(N==0)return 1;

        int ans=1;
        for(int i:lt){
            ans=(int)((1L*(i+1)*ans)%MOD);
        }
        return ans;
    }
}