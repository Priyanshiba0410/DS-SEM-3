import java.util.Scanner;
class Node {
    int data;
    Node info;

    public Node(int data) {
        this.data = data;
        this.info = null;
    }
}
public class Operations_SL {
    public Node first = null;
    public int count = 0;
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("--- Operations Singly Linked List ---");
            System.out.println("1. Insert at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node");
            System.out.println("4. Insert at the end");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the front: ");
                    int frontData = sc.nextInt();
                    insertAtFront(frontData);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    deleteFromFront();
                    break;
                case 4:
                    System.out.print("Enter the value to insert at the end: ");
                    int endData = sc.nextInt();
                    insertAtEnd(endData);
                    break;
                case 5:
                    deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter the position to delete (1-based index): ");
                    int position = sc.nextInt();
                    deleteFromPosition(position);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public  void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.info = first;
        first = newNode;
        count++;
    }

    public  void display() {
        Node temp = first;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.info;
        }
        System.out.println();
    }

    public  void deleteFromFront() {
        if (first == null) {
            System.out.println("Linked List is empty!");
            return;
        }
        int deletedData = first.data;
        first = first.info;
        count--;
        System.out.println("Deleted element from the front: " + deletedData);
    }

    public  void insertAtEnd(int data) {
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
        count++;
    }

    public  void deleteFromEnd() {
        if (first == null) {
            System.out.println("Linked List is empty!");
            return;
        }
        if (first.info == null) {
            int deletedData = first.data;
            first = null;
            count--;
            System.out.println("Deleted element from the end: " + deletedData);
            return;
        }
        Node temp = first;
        while (temp.info.info != null) {
            temp = temp.info;
        }
        int deletedData = temp.info.data;
        temp.info = null;
        count--;
        System.out.println("Deleted element from the end: " + deletedData);
    }

    public  void deleteFromPosition(int position) {
        if (position < 1 || position > count) {
            System.out.println("Invalid position. Please enter a valid position.");
            return;
        }
        if (position == 1) {
            deleteFromFront();
            return;
        }
        Node temp = first;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.info;
        }
        int deletedData = temp.info.data;
        temp.info = temp.info.info;
        count--;
        System.out.println("Deleted element from position " + position + ": " + deletedData);
    }
}
