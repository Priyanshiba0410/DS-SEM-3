class Node {
    int data;
    Node info;

    public Node(int data) {
        this.data = data;
        this.info = null;
    }
}

class LinkedList {
    Node first;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.info != null) {
                temp = temp.info;
            }
            temp.info = newNode;
        }
    }

    public void removeDuplicates() {
        if (first == null) {
            return;
        }

        Node current = first;
        while (current != null) {
            Node runner = current;
            while (runner.info != null) {
                if (runner.info.data == current.data) {
                    runner.info = runner.info.info; 
                } else {
                    runner = runner.info;
                }
            }
            current = current.info;
        }
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.info;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.insert(20);

        System.out.println("Original list:");
        list.display();

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.display();
    }
}
