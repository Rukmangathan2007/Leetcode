class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int N=nums.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                max=Math.max(max,(nums[i]-1)*(nums[j]-1));
            }
        }
        return max;
    }
}