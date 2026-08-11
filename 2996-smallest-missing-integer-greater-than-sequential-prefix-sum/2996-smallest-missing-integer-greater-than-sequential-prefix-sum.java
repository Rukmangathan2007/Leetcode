class Solution {
    public int missingInteger(int[] A) {
        int n=A.length;
        Set<Integer> set=new HashSet<>();
        for(int x:A)
            set.add(x);

        int sum=A[0];
        for(int i=1;i<n;i++){
            if(A[i]==A[i-1]+1)
                sum+=A[i];
            else
                break;
        }
        while(set.contains(sum))
            sum++;


        return sum;
    }
}