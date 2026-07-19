class Solution {
    public String smallestSubsequence(String s) {
        Map<Character,Integer> fre=new HashMap<>();
        Map<Character,Integer> vis=new HashMap<>();
        for(char c:s.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }


        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            fre.put(c,fre.get(c)-1);
            if(vis.getOrDefault(c,0)==1) continue;
            while(!st.isEmpty() && st.peek()>c && fre.get(st.peek())>0){
                vis.put(st.peek(),0);
                st.pop();
            }
            st.push(c);
            vis.put(c,1);
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st) ans.append(c);
        return ans.toString();
    }
}