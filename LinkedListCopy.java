class ListNode 
{
    int val;
    ListNode info;

    ListNode(int val)
     {
        this.val = val;
        this.info = null;
    }
}

public class LinkedListCopy 
{
    public static ListNode copyLinkedList(ListNode first) 
    {
        if (first == null)
         {
            return null; 
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (first != null)
         {
            ListNode newNode = new ListNode(first.val);
            current.info = newNode;
            current = current.info;

            first = first.info;
         }

        return dummy.info; 
    }

    public static void main(String[] args) 
    {
        ListNode originalList = new ListNode(11);
        originalList.info = new ListNode(20);
        originalList.info.info = new ListNode(35);
        ListNode copiedList = copyLinkedList(originalList);
        while (copiedList != null) 
        {
            System.out.print(copiedList.val + " ");
            copiedList = copiedList.info;
        }
    }
}
