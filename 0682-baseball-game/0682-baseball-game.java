class Solution{
    public int calPoints(String[] operations){
        int[] score=new int[operations.length];
        int j=0,sum=0;

        for(String s:operations){
            if(s.equals("+")){
                score[j]=score[j-1]+score[j-2];
                sum+=score[j++];
            }
            else if(s.equals("D")){
                score[j]=score[j-1]*2;
                sum+=score[j++];
            }
            else if(s.equals("C")){
                sum-=score[--j];
            }
            else{
                score[j]=Integer.parseInt(s);
                sum+=score[j++];
            }
        }

        return sum;
    }
}