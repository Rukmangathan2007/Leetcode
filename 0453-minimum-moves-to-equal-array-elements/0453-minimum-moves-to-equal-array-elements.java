class Solution {
    public int minMoves(int[] nums) {
        int min=1000000001;
        int move=0;
        for(int i:nums)min=Math.min(min,i);
        for(int i:nums)move+=i-min;
        return move;
    }
}