class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    private Node first;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public boolean areEqual(LinkedList otherList) {
        Node current1 = first;
        Node current2 = otherList.first;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.link;
            current2 = current2.link;
        }

        return current1 == null && current2 == null;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(10);
        list1.insert(20);
        list1.insert(30);

        LinkedList list2 = new LinkedList();
        list2.insert(10);
        list2.insert(20);
        list2.insert(30);

        boolean equalLists = list1.areEqual(list2);
        System.out.println("Lists are equal: " + equalLists);
    }
}