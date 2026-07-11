class Solution{
    public int longestBalanced(String s){
        int n=s.length();
        int[] a=new int[26];
        int ans=0;
        for(int i=0;i<n;i++){
            Arrays.fill(a,0);
            int mx=0,v=0;
            for(int j=i;j<n;j++){
                int c=s.charAt(j)-'a';
                a[c]++;
                if(a[c]==1){
                    v++;
                }
                if(a[c]>mx){
                    mx=a[c];
                }
                if(mx*v==j-i+1){
                    if(j-i+1>ans){
                        ans=j-i+1;
                    }
                }
            }
        }

        return ans;
    }
}