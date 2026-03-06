class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] l=new int[len];
        int[] r=new int[len];
        l[0]=height[0];
        r[len-1]=height[len-1];
        for(int i=1;i<len;i++)l[i]=Math.max(l[i-1],height[i]);
        for(int i=len-2;i>=0;i--)r[i]=Math.max(r[i+1],height[i]);
        int sum=0;
        for(int i=0;i<len;i++){
            int h=Math.min(l[i],r[i]);
            sum+=h-height[i];
        }
        return sum;
    }
}