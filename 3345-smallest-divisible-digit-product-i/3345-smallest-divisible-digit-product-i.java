class Solution {
    public int digitpro(int num){
        int pro=1;
        while(num>0){
            pro*=num%10;
            num/=10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        int tem=n;
        while(tem<=100){
            if(digitpro(tem)%t==0){
                return tem;
            }
            tem++;
        }
        return 0;
    }
}