class Solution {
    public int maxProduct(int[] nums) {
        int N=nums.length;
        int max=nums[0],ans=nums[0],min=nums[0];
        
        for(int i=1;i<N;i++){
            int t=max;
            max=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
            min=Math.min(nums[i],Math.min(t*nums[i],min*nums[i]));
            ans=Math.max(ans,max);
        }

        return ans;
    }
}