class Solution {
    public boolean uniformArray(int[] nums) {
        int omin=Integer.MAX_VALUE;

        for(int i:nums){
            if(i%2!=0 && omin>i)omin=i;
        }
        boolean ispos=true;
        for(int i:nums){
            if(i%2!=0 && omin>=i){
                ispos=false;
                break;
            }
        }

        if(ispos)return true;

        for(int i:nums){
            if(i%2==0 && omin>i){
                return false;
            }
        }

        return true;
    }
}