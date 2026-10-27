class Solution {
    public String[] createGrid(int m, int n) {
        String[] res=new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n-1;j++){
                if(i==0)sb.append('.');
                else sb.append('#');
            }
            sb.append('.');

            res[i]=sb.toString();
        }

        return res;
    }
}