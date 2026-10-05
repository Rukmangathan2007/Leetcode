class Solution {
    public String removeOuterParentheses(String s) {
        int N=s.length();
        List<Integer> list=new ArrayList<>(); 
        for(int i=0;i<N;i++){
            list.add(i);
            int ht=1;
            i++;
            while(true){
                if(s.charAt(i)==')')ht--;
                else ht++;
                if(ht==0)break;
                i++;
            }
            list.add(i);

        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            if(list.contains(i))continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}