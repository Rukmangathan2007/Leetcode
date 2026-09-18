class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int N=s.length();
        int[][] idx=new int[26][2];

        Arrays.fill(idx[0],-1);

        for(int i=0;i<26;i++){
            idx[i][0]=-1;
            idx[i][1]=-1;
        }

        for(int i=0;i<N;i++){
            int ch=s.charAt(i)-'a';

            if(idx[ch][0]==-1)
                idx[ch][0]=i;

            idx[ch][1]=i;
        }

        List<int[]> intervals=new ArrayList<>();

        for(int i=0;i<26;i++){
            if(idx[i][0]==-1)
                continue;

            int start=idx[i][0];
            int end=idx[i][1];

            boolean valid=true;

            for(int j=start;j<=end;j++){
                int ch=s.charAt(j)-'a';

                if(idx[ch][0]<start){
                    valid=false;
                    break;
                }

                end=Math.max(end,idx[ch][1]);
            }

            if(valid)
                intervals.add(new int[]{start,end});
        }

        intervals.sort((a,b)->Integer.compare(a[1],b[1]));

        List<String> res=new ArrayList<>();
        int prev=-1;

        for(int[] interval:intervals){
            if(interval[0]>prev){
                res.add(s.substring(interval[0],interval[1]+1));
                prev=interval[1];
            }
        }

        return res;
    }
}