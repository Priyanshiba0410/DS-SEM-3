class Node {
    int data;
    Node info;

    public Node(int data) {
        this.data = data;
        this.info = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.info = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        int poppedValue = top.data;
        top = top.info;
        return poppedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
