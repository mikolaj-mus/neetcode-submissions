class KthLargest {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int length;
    public KthLargest(int k, int[] nums) {
        this.length = k;
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        this.heap.add(val);
        if (heap.size() > length) {
            heap.poll();
        }
        return heap.peek();
    }
}
