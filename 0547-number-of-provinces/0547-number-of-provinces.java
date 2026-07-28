class Solution {
    public void join(int[] leader,int lt,int rt){
        leader[find(leader,lt)]=find(leader,rt);
    }

    public int find(int[] leader,int node){
        if(leader[node] != node){
            leader[node]=find(leader,leader[node]);
            return leader[node];
        }
        return node;
    }   

    public int findCircleNum(int[][] isConnected) {
        int N=isConnected.length;
        int[] leader=new int[N+1];
        for(int i=1;i<N+1;i++){
            leader[i]=i;
        }

        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                if(isConnected[row][col]==1){
                    join(leader,row+1,col+1);
                }
            }
        }

        Set<Integer> st=new HashSet<>();
        for(int i=1;i<N+1;i++){
            st.add(find(leader,leader[i]));
        }

        return st.size();
    }
}