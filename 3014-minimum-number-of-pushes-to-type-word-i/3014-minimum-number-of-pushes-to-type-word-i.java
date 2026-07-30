class Solution {
    public int minimumPushes(String word) {
        int N=word.length();
        int ans=0;
        if(N<=8){
            return N;
        }
        ans+=8;
        N-=8;

        if(N<=8){
            return (N*2)+ans;
        }
        ans+=8*2;
        N-=8;

        if(N<=8){
            return (N*3)+ans;
        }
        ans+=(8*3);
        N-=8;
        return (N*4)+ans;

    }
}