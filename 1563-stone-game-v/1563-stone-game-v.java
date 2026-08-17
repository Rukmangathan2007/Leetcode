class Solution {
    public int solve(int start,int end,int[] arr,int[][] dp){
        if(start>=end) return 0;

        int l=0;
        int r=0;

        if(dp[start][end]!=-1) return dp[start][end];

        for(int i=start;i<=end;i++){
            r+=arr[i];
        }

        int ans=0;

        for(int i=start;i<end;i++){
            l+=arr[i];
            r-=arr[i];

            // three conditions: l<r, l==r and l>r
            if(l<r) ans=Math.max(ans,l+solve(start,i,arr,dp));

            if(l==r){
                ans=Math.max(ans,Math.max(
                    l+solve(start,i,arr,dp),
                    r+solve(i+1,end,arr,dp)
                ));
            }

            if(l>r) ans=Math.max(ans,r+solve(i+1,end,arr,dp));
        }

        return dp[start][end]=ans;
    }

    public int stoneGameV(int[] stoneValue){
        int n=stoneValue.length;

        int[][] dp=new int[n][n];

        for(int i=0;i<n;i++){
            java.util.Arrays.fill(dp[i],-1);
        }

        return solve(0,n-1,stoneValue,dp);
    }
}