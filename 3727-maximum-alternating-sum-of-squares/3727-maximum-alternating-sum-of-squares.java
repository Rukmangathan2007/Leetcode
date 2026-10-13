class Solution {
    public long maxAlternatingSum(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        long sum=0;
        for(int i=0;i<N;i++){
            if(i<N/2)sum-=nums[i]*nums[i];
            else sum+=nums[i]*nums[i];

            System.out.println(sum);
        }

        return sum;
    }
}