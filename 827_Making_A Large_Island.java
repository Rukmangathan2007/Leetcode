class Solution {
    HashMap<Integer,Integer> ils=new HashMap<>();
    
    int[] dif={0,-1,0,1,0};


    private int ild_siz(int[][] grid,int[][] ild_no,int row,int col,int N,int ino){
        if(grid[row][col]==0)return 0;
        int count=0;
        for(int i=0;i<4;i++){
            int ar=row+dif[i];
            int ac=col+dif[i+1];
            if(ar>=0 && ar<N && ac>=0 && ac<N && grid[ar][ac]!=0 && ild_no[ar][ac]==0){
                ild_no[ar][ac]=ino;
                count+=ild_siz(grid,ild_no,ar,ac,N,ino);
            }
        }
        return count+1;
    }

    private int swap_len(int[][] grid,int[][] ild_no,int row,int col,int N){
        Set<Integer> check=new HashSet<>();
        int count=0;
        for(int i=0;i<4;i++){
            int ar=row+dif[i];
            int ac=col+dif[i+1];
            if(ar>=0 && ar<N && ac>=0 && ac<N && grid[ar][ac]==1 && !check.contains(ild_no[ar][ac])){
                check.add(ild_no[ar][ac]);
                count+=ils.get(ild_no[ar][ac]);
            }
        }
        return count+1;
    }


    public int largestIsland(int[][] grid) {
        int N=grid.length;
        int[][] ild_no=new int[N][N];
        int ino=1;
        int max=0;
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                if(grid[row][col]!=0 && ild_no[row][col]==0){
                    ild_no[row][col]=ino;
                    int count=ild_siz(grid,ild_no,row,col,N,ino);
                    max=Math.max(count,max);
                    ils.put(ino,count);
                    ino++;
                }
            }
        }
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                if(grid[row][col]==0){
                    int aft_count=swap_len(grid,ild_no,row,col,N);
                    max=Math.max(max,aft_count);
                }
            }
        }
        return max;
    }
}