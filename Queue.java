class Node {
    int data;
    Node info;

    public Node(int data) {
        this.data = data;
        this.info = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.info = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty.");
        }
        int dequeuedValue = front.data;
        front = front.info;
        if (front == null) {
            rear = null; 
        }
        return dequeuedValue;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty.");
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
