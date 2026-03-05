class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> sm=new HashMap<>();
        HashMap<Character,Integer> tm=new HashMap<>();
        for(char ch:secret.toCharArray()){
            sm.put(ch,sm.getOrDefault(ch,0)+1);
        }
        for(char ch:guess.toCharArray()){
            tm.put(ch,tm.getOrDefault(ch,0)+1);
        }
        int common=0;
        for(char key:sm.keySet()){
            common+=Math.min(sm.get(key),tm.getOrDefault(key,0));
        }
        int bull=0;
        for(int i=0;i<secret.length() &&i<guess.length() ;i++){
            if(secret.charAt(i)==guess.charAt(i))bull++;
        }
        return bull+"A"+(common-bull)+"B";
    }
}