class Solution {
    public int largestRectangleArea(int[] arr) {
        int N=arr.length;

        Stack<Integer> st=new Stack<>();

        int max=0;

        for(int i=0;i<N;i++){
            int cur=arr[i];
            if(st.isEmpty() || arr[st.peek()]<cur){
                st.add(i);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]>=cur){
                    int cidx=st.pop();
                    if(st.isEmpty()){
                        max=Math.max(max,i*arr[cidx]);
                    }
                    else{
                        max=Math.max(max,(i-st.peek()-1)*arr[cidx]);
                    }
                }
                st.add(i);
            }

        }


        while(!st.isEmpty()){
            int cur=st.pop();
            if(st.isEmpty()){
                max=Math.max(max,N*arr[cur]);
            }
            else{
                max=Math.max(max,(N-st.peek()-1)*arr[cur]);
            }
        }
        return max;
    }
}