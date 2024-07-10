class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Structure_Singly {
    public static void main(String[] args) {
        Node node = new Node(42);
        System.out.println("Data in the node: " + node.data);
    }
}
