class Solution {

    public String base2(int n) {
        if (n == 0) return "0";
        String ans = "";
        while (n != 0) {
            ans = (n & 1) + ans;
            n = n >> 1;
        }
        return ans;
    }

    public String baseNeg2(int n) {
        if (n == 0) return "0";
        String ans = "";
        while (n != 0) {
            ans = (n & 1) + ans;
            n = -(n >> 1);
        }

        return ans;
    }
}