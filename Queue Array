class ArrayQueue {
    private int[] queue;
    private int front, rear, size;

    // Constructor
    public ArrayQueue(int initialSize) {
        size = initialSize;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int x) {
        if (rear == size - 1) { // Array full, resize
            int newSize = size * 2;
            int[] newQueue = new int[newSize];
            for (int i = 0; i <= rear; i++) {
                newQueue[i] = queue[i];
            }
            queue = newQueue;
            size = newSize;
            System.out.println("Array resized to: " + size);
        }
        rear++;
        queue[rear] = x;
        System.out.println("Enqueued: " + x);
    }

    // Dequeue
    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
    }

    // Peek
    public void peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display Queue
    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Find Minimum
    public void findMin() {
        if (front > rear) return;
        int min = queue[front];
        for (int i = front; i <= rear; i++) {
            if (queue[i] < min) min = queue[i];
        }
        System.out.println("Minimum: " + min);
    }

    // Find Maximum
    public void findMax() {
        if (front > rear) return;
        int max = queue[front];
        for (int i = front; i <= rear; i++) {
            if (queue[i] > max) max = queue[i];
        }
        System.out.println("Maximum: " + max);
    }
}
