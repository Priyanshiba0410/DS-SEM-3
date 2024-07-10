class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class CircularLinkedList {
    private Node first;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            first.link = first;
        } else {
            Node current = first;
            while (current.link != first) {
                current = current.link;
            }
            current.link = newNode;
            newNode.link = first;
        }
    }

    public int countNodes() {
        if (first == null) {
            return 0;
        }

        int count = 0;
        Node current = first;
        do {
            count++;
            current = current.link;
        } while (current != first);

        return count;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        int nodeCount = list.countNodes();
        System.out.println("Number of nodes: " + nodeCount);
    }
}