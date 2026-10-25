class Solution {
    
    boolean sur=true;
    int[] dif={0,-1,0,1,0};
    boolean[][] vis;
    public void dfs(int[][] grid,int R,int C,int r,int c){
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int ar=r+dif[i];
            int ac=c+dif[i+1];

            if(ar<0 || ar>=R || ac<0 || ac>=C){
                sur=false;
                continue;
            }
            if(grid[ar][ac]==0 && !vis[ar][ac]){
                dfs(grid,R,C,ar,ac);
            }
        }
    }
    public int closedIsland(int[][] grid) {
        int island=0;
        int R=grid.length;
        int C=grid[0].length;

        vis=new boolean[R][C];


        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==0 && !vis[r][c]){
                    sur=true;
                    dfs(grid,R,C,r,c);
                    if(sur)island++;
                }
            }
        }



        return island;
    }
}