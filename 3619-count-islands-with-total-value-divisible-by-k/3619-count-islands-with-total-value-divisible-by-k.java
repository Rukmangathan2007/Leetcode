class Solution {
    public int countIslands(int[][] grid, int k) {
        int R=grid.length,C=grid[0].length,count=0;
        int[] dif={0,-1,0,1,0};
        long sum=0;
        Queue<int[]> q=new LinkedList<>();
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]!=0){
                    sum=grid[row][col];
                    q.add(new int[] {row,col});
                    grid[row][col]=0;
                    while(!q.isEmpty()){
                        int[] cell=q.poll();
                        int r=cell[0],c=cell[1];
                        for(int i=0;i<4;i++){
                            int ar=r+dif[i];
                            int ac=c+dif[i+1];
                            if(ar>=0 && ar<R && ac>=0 && ac<C && grid[ar][ac]!=0){
                                q.add(new int[] {ar,ac});
                                sum+=grid[ar][ac];
                                grid[ar][ac]=0;
                            }
                        }
                    }
                    if(sum!=0 && sum%k==0)count++;
                }
            }
        }
        return count;
    }
}