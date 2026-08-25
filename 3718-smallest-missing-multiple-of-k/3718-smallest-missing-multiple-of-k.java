class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int mul=1;
        for(int i:nums){

            if(mul*k>i)continue;
            
            else if(mul*k<i)return mul*k;
            
            else mul++;
        }
        return mul*k;
    }
}