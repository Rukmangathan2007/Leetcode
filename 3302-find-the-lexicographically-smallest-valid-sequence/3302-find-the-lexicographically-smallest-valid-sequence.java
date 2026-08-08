class Solution {
    public int[] validSequence(String s,String t) {
        int n=s.length();
        int m=t.length();

        int j=m-1;
        int[] dp=new int[n+1];

        for(int i=n-1;i>=0;i--){
            if(j>=0 && s.charAt(i)==t.charAt(j)){
                dp[i]=dp[i+1]+1;
                j--;
            }else{
                dp[i]=dp[i+1];
            }
        }

        List<Integer> ans=new ArrayList<>();
        j=0;
        boolean flag=true;

        for(int i=0;i<n && j<m;i++){
            int rem=m-j-1;

            if(s.charAt(i)==t.charAt(j)){
                ans.add(i);
                j++;
            }else if(flag && dp[i+1]>=rem){
                ans.add(i);
                j++;
                flag=false;
            }
        }

        if(j==m){
            int[] result=new int[ans.size()];

            for(int i=0;i<ans.size();i++){
                result[i]=ans.get(i);
            }

            return result;
        }

        return new int[0];
    }
}