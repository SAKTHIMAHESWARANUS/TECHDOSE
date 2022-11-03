class KthLargest {
        private int k;
        private static PriorityQueue<Integer> heap;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        heap=new PriorityQueue<>();
        for(int i:nums){
            add(i);
        }
        
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }
}
