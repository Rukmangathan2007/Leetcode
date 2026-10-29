class Solution {
    public int longestSubarray(int[] a) {
        Scanner sc = new Scanner(System.in);
        int c1=0,max=0;
        int n=a.length;
        int c_0=0,c2=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                c1++;
                c2++;
            }
            else{
                c_0++;
                if(c_0==1)
                    c2=0;
                if(c_0==2){
                    max=Math.max(max,c1);
                    c1=c2;
                    c2=0;
                    c_0=1;
                }
            }

        }
        max=Math.max(max,c1);
        if(a.length==max)max--;
        return max;
    }
}