class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int N=img1.length;
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int cur=0;
                for(int row2=i,row1=0;row2<N;row2++,row1++){
                    for(int col2=j,col1=0;col2<N;col2++,col1++){
                        if(img1[row1][col1]==1 && img2[row2][col2]==1)cur++;
                    }
                }
                max=Math.max(max,cur);
            }
        }

        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int cur=0;
                for(int row1=i,row2=0;row1<N;row1++,row2++){
                    for(int col1=j,col2=0;col1<N;col1++,col2++){
                        if(img1[row1][col1]==1 && img2[row2][col2]==1)cur++;
                    }
                }
                max=Math.max(max,cur);
            }
        }

        
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<N;j++){
                int cur=0;
                for(int row1=i,row2=N-1;row1>=0;row1--,row2--){
                    for(int col1=j,col2=0;col1<N;col1++,col2++){
                        if(img1[row1][col1]==1 && img2[row2][col2]==1)cur++;
                    }
                }
                max=Math.max(max,cur);
            }
        }

        
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<N;j++){
                int cur=0;
                for(int row2=i,row1=N-1;row2>=0;row1--,row2--){
                    for(int col2=j,col1=0;col2<N;col1++,col2++){
                        if(img1[row1][col1]==1 && img2[row2][col2]==1)cur++;
                    }
                }
                max=Math.max(max,cur);
            }
        }


        return max;
    }
}