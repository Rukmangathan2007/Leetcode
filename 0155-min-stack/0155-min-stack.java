class MinStack {
    int[] st;
    int[] mst;
    int top,mtop;
    public MinStack() {
        st=new int[30001];
        mst=new int[30001];
        top=-1;
        mtop=-1;
    }
    
    public void push(int value) {
        st[++top]=value;
        if(mtop==-1 || mst[mtop]>=value){
            mst[++mtop]=value;
        }

    }
    
    public void pop() {
        if(st[top]==mst[mtop]){
            mtop--;
        }
        top--;
    }
    
    public int top() {
        return st[top];
    }
    
    public int getMin() {
        return mst[mtop];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */