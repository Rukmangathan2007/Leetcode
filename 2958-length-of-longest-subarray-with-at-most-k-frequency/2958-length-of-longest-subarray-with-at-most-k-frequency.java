class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int i=0,j=0;
        int ans=0;
        while(j<nums.length){
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            while(m.get(nums[j])>k){
                m.put(nums[i],m.get(nums[i])-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }



        return ans;
    }
}