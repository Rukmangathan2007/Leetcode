class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        boolean[] fre=new boolean[101];
        int min=10000,max=0;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
            fre[i]=true;
        }

        for(int i=min+1;i<=max;i++){
            if(!fre[i])res.add(i);
        }
        return res;
    }
}