class Solution {
    int[] row_flag=new int[9];
    int[] col_flag=new int[9];
    int[] subgrid_flag=new int[9];
    boolean is_finished=false;
    public void solve(char[][] board,int row,int col) {
        //if(row>8 || col>8)return;
        char cur=board[row][col];
        int next_row=row,next_col=col+1;
        if(next_col==9){
            next_col=0;
            next_row++;
        }
        if(cur!='.'){
            if(row==8 && col==8){
                is_finished=true;
                return;
            }
            solve(board,next_row,next_col);
            return;
        }
        for(int i=1;i<=9;i++){
            
            int sft=1<<(i);
            if((row_flag[row]&sft)==0&&(col_flag[col]&sft)==0&&(subgrid_flag[(row/3)*3+(col/3)]&sft)==0){
                row_flag[row]|=sft;
                col_flag[col]|=sft;
                subgrid_flag[(row/3)*3+(col/3)]|=sft;
                board[row][col]=(char)(i+'0');
                if(row==8 && col==8){
                    is_finished=true;
                    return;
                }
                solve(board,next_row,next_col);
                if(is_finished)return;   
                row_flag[row]&=~sft;
                col_flag[col]&=~sft;
                subgrid_flag[(row/3)*3+(col/3)]&=~sft;         
            }
        }
        board[row][col]='.';
    }
    public void solveSudoku(char[][] board) {
        int R=9,C=9;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                char cur=board[row][col];
                if(cur=='.')continue;
                int sft=1<<((int)(cur-'0'));
                row_flag[row]|=sft;
                col_flag[col]|=sft;
                subgrid_flag[(row/3)*3+(col/3)]|=sft;
            }
        }
        solve(board,0,0);
    }
}