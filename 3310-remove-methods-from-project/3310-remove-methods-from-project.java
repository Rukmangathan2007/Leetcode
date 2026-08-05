class Solution {
    public List<Integer> remainingMethods(int n,int k,int[][] invocations) {
        List<Integer>[] edges=new ArrayList[n];
        for(int i=0;i<n;i++) edges[i]=new ArrayList<>();

        int[] inDegree=new int[n];
        for(int[] inv:invocations){
            edges[inv[0]].add(inv[1]);
            inDegree[inv[1]]++;
        }

        Queue<Integer> q=new ArrayDeque<>();
        boolean[] sus=new boolean[n];
        q.offer(k);
        sus[k]=true;

        while(!q.isEmpty()){
            int u=q.poll();

            for(int v:edges[u]){
                inDegree[v]--;

                if(!sus[v]){
                    sus[v]=true;
                    q.offer(v);
                }
            }
        }

        boolean canRemoveAll=true;
        List<Integer> rem=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(sus[i] && inDegree[i]>0){
                canRemoveAll=false;
                break;
            }

            if(!sus[i]) rem.add(i);
        }

        if(!canRemoveAll){
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++) ans.add(i);
            return ans;
        }

        return rem;
    }
}