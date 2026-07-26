class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int N=nums.length;
        return Math.max(nums[0]*nums[1]*nums[2],Math.max(nums[0]*nums[1]*nums[N-1],nums[N-1]*nums[N-2]*nums[N-3]));
    }
}