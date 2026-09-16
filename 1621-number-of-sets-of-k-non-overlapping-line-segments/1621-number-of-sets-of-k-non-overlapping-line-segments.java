class Solution {
    long count=0;
    long MOD=1000000007L;

    public int numberOfSets(int N, int k) {
        long[][] dp=new long[N][k+1];
        for(int i=0;i<N;i++){
            dp[i][0]=1;
        }

        for(int j=1;j<=k;j++){
            long sum=0;
            for(int i=1;i<N;i++){
                sum=(sum+dp[i-1][j-1])%MOD;

                dp[i][j]=(dp[i-1][j]+sum) % MOD;
            }

        }
        return (int)dp[N-1][k];

        
    }
}