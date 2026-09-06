class Solution {
    public int numDistinct(String s, String t) {
        int N=s.length();
        int M=t.length();

        int[][] dp=new int[N+1][M+1];

        for(int i=0;i<N+1;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<N+1;i++){
            for(int j=1;j<M+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }

                else{
                    dp[i][j]=dp[i-1][j];
                }

            }
        }

        return dp[N][M];
    }
}