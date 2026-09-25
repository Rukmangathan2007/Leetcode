class Solution {
    TreeSet<String> ans=new TreeSet<>();

    void dfs(String s) {
        int r=s.indexOf('}');

        if(r==-1) {
            ans.add(s);
            return;
        }

        int l=s.lastIndexOf('{',r);

        String lt=s.substring(0,l);
        String rt=s.substring(r+1);
        String in=s.substring(l+1,r);

        for(String part:in.split(",")) {
            dfs(lt+part+rt);
        }
    }

    public List<String> braceExpansionII(String expression) {
        dfs(expression);

        return new ArrayList<>(ans);
    }
}