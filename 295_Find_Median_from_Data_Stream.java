class MedianFinder {
    private PriorityQueue<Integer> min_heap,max_heap;

    public MedianFinder() {
        min_heap=new PriorityQueue<>();
        max_heap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        min_heap.add(num);
        if(min_heap.size()>max_heap.size()+1){
            max_heap.add(min_heap.poll());
        }
        if(!max_heap.isEmpty() && max_heap.peek()>min_heap.peek()){
            int tem=min_heap.poll();
            min_heap.add(max_heap.poll());
            max_heap.add(tem);
        }
    }
    
    public double findMedian() {
        if(min_heap.size()>max_heap.size())return (double)min_heap.peek();
        else return (min_heap.peek()+max_heap.peek())/2.0;
    }
}