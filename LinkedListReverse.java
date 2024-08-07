class ListNode
 {
    int val;
    ListNode info;

    ListNode(int val) {
        this.val = val;
        this.info = null;
    }
}

public class LinkedListReverse 
{
    public static ListNode reverseLinkedList(ListNode head) 
    {
        ListNode pred = null;
        ListNode current = head;

        while (current != null) 
        {
            ListNode nextTemp = current.info; 
            current.info = pred; 
            pred = current;
            current = nextTemp;
        }

        return pred;
    }

    public static void main(String[] args) 
    {
        ListNode originalList = new ListNode(1);
        originalList.info = new ListNode(2);
        originalList.info.info = new ListNode(3);
        ListNode reversedList = reverseLinkedList(originalList);
        while (reversedList != null) 
        {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.info;
        }
    }
}
