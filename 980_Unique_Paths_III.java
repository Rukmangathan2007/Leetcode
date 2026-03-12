class Solution {
    int count=0,c0=0;
    int[] dif={0,-1,0,1,0};
    private void rec(int[][] grid,int R,int C,int r,int c){
        c0--;
        if(c0==0){
            if(grid[r][c]==2){
                count++;
            }
            c0++;
            return;
        }
        if(grid[r][c]==2){
            c0++;
            return;
        }
        grid[r][c]=1;
        for(int i=0;i<4;i++){
            int ar=r+dif[i];
            int ac=c+dif[i+1];
            if(ar>=0 && ar<R && ac>=0 && ac<C && (grid[ar][ac]==0 || grid[ar][ac]==2)){
                rec(grid,R,C,ar,ac);
            }
        }
        c0++;
        grid[r][c]=0;
    }
    public int uniquePathsIII(int[][] grid) {
        int R=grid.length,C=grid[0].length,r=0,c=0;

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    r=i;
                    c=j;
                }
                if(grid[i][j]==0){
                    c0++;
                }
            }
        }
        c0+=2;
        rec(grid,R,C,r,c);
        return count;
    }
}