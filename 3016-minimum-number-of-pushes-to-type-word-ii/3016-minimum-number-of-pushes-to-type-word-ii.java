class Solution {
    public int minimumPushes(String word) {
        int[] fre=new int[27];
        for(char ch:word.toCharArray()){
            fre[(int)ch-'a'+1]++;
        }
        Arrays.sort(fre);

        int ans=0;
        for(int i=26;i>=0;i--){
            System.out.print(fre[i]+" ");
            ans+=Math.ceil((27-i)/8.0)*fre[i];
        }

        return ans;

    }
}