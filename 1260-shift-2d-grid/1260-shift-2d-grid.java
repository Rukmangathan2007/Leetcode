class Solution{
    public List<List<Integer>> shiftGrid(int[][] grid,int k){
        int R=grid.length,C=grid[0].length;
        int N=R*C;
        k%=N;
        List<List<Integer>> ans=new ArrayList<>();

        for(int row=0;row<R;row++){
            List<Integer> temp=new ArrayList<>();
            for(int col=0;col<C;col++){
                temp.add(0);
            }
            ans.add(temp);
        }

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                int old=row*C+col;
                int curr=(old+k)%N;
                int nr=curr/C;
                int nc=curr%C;
                ans.get(nr).set(nc,grid[row][col]);
            }
        }

        return ans;
    }
}