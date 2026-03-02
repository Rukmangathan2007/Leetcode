class Solution {
    public boolean isValidSudoku(char[][] board) {
        int R=9,C=9;
        boolean[][] row_flg=new boolean[9][10];
        boolean[][] col_flg=new boolean[9][10];
        boolean[][] sub_flg=new boolean[9][10];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                char cur=board[row][col];
                int digit=(int)(cur-'0');
                if(cur=='.')continue;
                if(row_flg[row][digit] || col_flg[col][digit] || sub_flg[(row/3)*3+(col/3)][digit]){
                    return false;
                }
                row_flg[row][digit]=true;
                col_flg[col][digit]=true;
                sub_flg[(row/3)*3+(col/3)][digit]=true;

            }
        }
        return true;
    }
}