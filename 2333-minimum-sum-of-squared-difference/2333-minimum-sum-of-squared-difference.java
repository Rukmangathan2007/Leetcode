class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int N=nums1.length;
        TreeSet<Integer> st=new TreeSet<>(Collections.reverseOrder());
        Map<Integer,Integer> fre=new HashMap<>();
        fre.put(0,0);
        for(int i=0;i<N;i++){
            int tem=Math.abs(nums1[i]-nums2[i]);
            st.add(tem);
            fre.put(tem,fre.getOrDefault(tem,0)+1);
        }
        long k=k1+k2;
        while(k>0 && !st.isEmpty()){
            int val=st.pollFirst();
            if(val==0)break;
            int next=st.isEmpty()?0:st.first();
            int count=fre.get(val);
            fre.remove(val);

            long dif=val-next;
            dif*=count;

            if(dif<=k){
                k-=dif;
                fre.put(next,fre.get(next)+count);
            }
            else{
                int div=(int)(k/count);
                int mod=(int)(k%count);

                int newVal=val-div;

                fre.put(newVal,fre.getOrDefault(newVal,0)+count-mod);

                if(mod>0)
                    fre.put(newVal-1,fre.getOrDefault(newVal-1,0)+mod);

                k=0;
            }
            
        }
        long res=0;
        for(int i:fre.keySet()){
            res+=(long)i*i*fre.get(i);
        }



        return res;
    }
}