class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int[][] ans=new int[m-k+1][n-k+1];

        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                List<Integer> v=new ArrayList<>();

                for(int x=i;x<i+k;x++)
                    for(int y=j;y<j+k;y++)
                        v.add(grid[x][y]);

                Collections.sort(v);

                int mn=Integer.MAX_VALUE;

                for(int p=1;p<v.size();p++){
                    if(!v.get(p).equals(v.get(p-1)))
                        mn=Math.min(mn,v.get(p)-v.get(p-1));
                }

                ans[i][j]=mn==Integer.MAX_VALUE?0:mn;
            }
        }

        return ans;
    }
}