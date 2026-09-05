class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int N = nums.length;

        int[] pre = new int[N];
        int[] pos = new int[N];

        pre[0]=nums[0];
        pos[N-1]=nums[N-1];
        for(int i=1;i<N;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        for(int i=N-2;i>=0;i--){
            pos[i]=Math.min(pos[i+1],nums[i]);
        }

        for(int i=0;i<N;i++){
            int cur=pre[i]-pos[i];
            if(cur<=k){
                return i;
            }
        }

        return -1;
        
    }
}