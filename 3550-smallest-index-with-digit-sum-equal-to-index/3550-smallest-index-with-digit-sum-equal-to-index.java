class Solution {
    int sod(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int N=nums.length;
        for(int i=0;i<N;i++){
            if(sod(nums[i])==i)return i;
        }
        return -1;
    }
}