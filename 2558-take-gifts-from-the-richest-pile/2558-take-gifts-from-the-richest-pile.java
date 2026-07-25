class Solution {
    public long pickGifts(int[] nums,int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));

        for(int num:nums) pq.add(num);

        while(k-->0) pq.add((int)Math.sqrt(pq.remove()));

        long sum=0;

        while(!pq.isEmpty()) sum+=pq.remove();

        return sum;
    }
}