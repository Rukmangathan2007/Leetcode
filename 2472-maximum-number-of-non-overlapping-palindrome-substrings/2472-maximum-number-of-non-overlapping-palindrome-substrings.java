class Solution {
    public int maxPalindromes(String s, int k) {
        int N=s.length();
        int min=2001;
        int count=0;
        int[] dp=new int[N];
        Arrays.fill(dp,2001);
        for(int i=0;i<N;i++){
            for(int j=i+k-1;j<N;j++){
                boolean ispal=true;
                int lt=i;
                int rt=j;
                while(lt<rt){
                    if(s.charAt(lt)!=s.charAt(rt)){
                        ispal=false;
                        break;
                    }
                    lt++;
                    rt--;
                }
                if(ispal){
                    dp[i]=Math.min(dp[i],j);
                    min=Math.min(min,j);
                    break;
                }
            }
        }
        if(min!=2001){
            count++;
            int end=min;
            while(true){
                min=2001;
                for(int i=end+1;i<N && i<min;i++){
                    min=Math.min(min,dp[i]);
                }
                if(min==2001)break;
                count++;
                end=min;
            }
        }
        return count;
    }
}