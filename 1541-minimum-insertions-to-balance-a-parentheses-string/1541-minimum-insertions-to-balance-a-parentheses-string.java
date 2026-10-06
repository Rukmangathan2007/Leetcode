class Solution {
    public int minInsertions(String s) {
        int ht=0;
        int N=s.length();
        int count=0;
        for(int i=0;i<N;i++){
            char ch=s.charAt(i);
            if(ch=='(')ht+=2;
            else{
                ht--;
                if(i+1==N){
                    count++;
                    ht--;
                }
                else if(s.charAt(i+1)=='('){
                    count++;
                    ht--;
                }
                else {
                    i++;
                    ht--;
                }
            }

            if(ht<0){
                count++;
                ht=0;
            }
        }

        return count+ht;
    }
}