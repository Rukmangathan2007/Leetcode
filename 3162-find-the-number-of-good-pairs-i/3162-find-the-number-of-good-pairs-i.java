class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int m=nums1.length,n=nums2.length;
        int ans=0;
        for(int i=0;i<n;i++)
            nums2[i]*=k;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(nums1[i]%nums2[j]==0)
                    ans++;
        return ans;
    }
}