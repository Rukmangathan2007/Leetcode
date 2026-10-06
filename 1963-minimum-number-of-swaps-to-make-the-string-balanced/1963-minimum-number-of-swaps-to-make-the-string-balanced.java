class Solution {
    public int minSwaps(String s) {
        char[] arr=s.toCharArray();
        int N=arr.length;
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=N-1;i>=0;i--){
            if(arr[i]=='[')q.add(i);
        }

        int h=0;
        for(int i=0;i<N;i++){
            if(arr[i]=='[')h++;
            else{
                h--;
            }

            if(h<0){
                h=1;
                count++;
                int rt=q.poll();
                char tem=arr[rt];
                arr[rt]=arr[i];
                arr[i]=tem;
            }
        }
        return count;

    }
}