class Solution {
    String rec(int n){
        if(n==1)return "0";
        String s=rec(n-1);
        String inv=new String(s);
        inv=inv.replace('1','.');
        inv=inv.replace('0','1');
        inv=inv.replace('.','0');
        return s+"1"+new StringBuilder(inv).reverse().toString();
    }
    public char findKthBit(int n, int k) {
        String s=rec(n);
        return s.charAt(k-1);
    }
}