class Solution {
    int i=0;
    public int sco(String s,int N){
        int h=1;
        int tot=0;
        while(h!=0 && i<N){
            if(s.charAt(i)=='('){
                i++;
                int cur=sco(s,N);
                if(cur==0)tot++;
                else tot+=2*cur;
            }
            else{
                h--;
                if(h==0)return tot;
                tot++;
            }
            i++;
        }

        return tot;
    }
    public int scoreOfParentheses(String s) {
        return sco(s,s.length());
    }
}