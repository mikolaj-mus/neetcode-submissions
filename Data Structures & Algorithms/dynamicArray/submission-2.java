class DynamicArray {

    int[] arr;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            arr = new int[capacity];
        }
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        
        arr[size] = n;
        size++;
        
    }

    public int popback() {
        int popped = arr[size - 1];
        size--;
        return popped;
    }

    private void resize() {
        int new_capacity = 2*capacity;
        int[] new_arr = new int[new_capacity];

        int i = 0;
        while (i < size) {
            new_arr[i] = arr[i];
            i++;
        }

        arr = new_arr;
        capacity = new_capacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
