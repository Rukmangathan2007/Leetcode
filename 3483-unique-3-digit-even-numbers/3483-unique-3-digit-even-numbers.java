class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        int N=digits.length;
        boolean[] unit=new boolean[10];
        

        for(int i=0;i<N;i++){
            int cunit=digits[i];
            if(cunit%2==0 && !unit[cunit]){
                unit[cunit]=true;
                boolean[] tenth=new boolean[10];
                for(int j=0;j<N;j++){
                    if(j==i)continue;
                    int ctenth=digits[j];
                    if(!tenth[ctenth]){
                        tenth[ctenth]=true;
                        boolean[] hun=new boolean[10];
                        for(int k=0;k<N;k++){
                            if(k==j || k==i)continue;
                            int chun=digits[k];
                            if(!hun[chun] && chun!=0){
                                hun[chun]=true;
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;

    }
}