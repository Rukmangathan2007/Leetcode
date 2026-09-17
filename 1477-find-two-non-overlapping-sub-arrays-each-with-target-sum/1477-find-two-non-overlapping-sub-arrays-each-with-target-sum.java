class Solution {
    public int minSumOfLengths(int[] arr,int k) {
        int N=arr.length;
        int res=N+1;
        int sum=0;
        int i=0;

        int[] dp=new int[N+1];
        Arrays.fill(dp,N);

        for(int j=0;j<N;j++){
            sum+=arr[j];

            while(sum>k)
                sum-=arr[i++];

            dp[j+1]=dp[j];

            if(sum==k){
                res=Math.min(res,j-i+1+dp[i]);
                dp[j+1]=Math.min(dp[j],j-i+1);
            }
        }

        return res==N+1?-1:res;
    }
}