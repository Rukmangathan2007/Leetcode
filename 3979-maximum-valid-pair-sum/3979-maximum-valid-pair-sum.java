class Solution {
    public int maxValidPairSum(int[] nums,int k) {
        int maxLeft=nums[0];
        int maxPairSum=Integer.MIN_VALUE;

        for(int i=0,j=k;j<nums.length;i++,j++) {
            maxLeft=Math.max(maxLeft,nums[i]);
            maxPairSum=Math.max(maxPairSum,maxLeft+nums[j]);
        }

        return maxPairSum;
    }
}