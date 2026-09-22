class Solution {
    public int uniquePaths(int m, int n) {
        int[] above=new int[n];
        Arrays.fill(above,1);

        for(int i=1;i<m;i++){
            int[] cur=new int[n];
            Arrays.fill(cur,1);

            for(int j=1;j<n;j++)
                cur[j]=cur[j-1]+above[j];

            above=cur;
        }

        return above[n-1];
    }
}