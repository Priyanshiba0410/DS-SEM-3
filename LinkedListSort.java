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

public class LinkedListSort 
{
    public static ListNode mergeSort(ListNode head) 
    {
        if (head == null || head.info == null) 
        {
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode left = head;
        ListNode right = mid.info;
        mid.info = null; 
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static ListNode findMiddle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.info != null && fast.info.info != null)
         {
            slow = slow.info;
            fast = fast.info.info;
        }

        return slow;
    }

    private static ListNode merge(ListNode left, ListNode right)
     {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (left != null && right != null) 
        {
            if (left.val < right.val) 
            {
                current.info = left;
                left = left.info;
            } else 
            {
                current.info = right;
                right = right.info;
            }
            current = current.info;
        }

        if (left != null)
         {
            current.info = left;
        }
        if (right != null)
         {
            current.info = right;
        }

        return dummy.info;
    }

    public static void printList(ListNode head) 
    {
        while (head != null)
         {
            System.out.print(head.val + " ");
            head = head.info;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        ListNode originalList = new ListNode(3);
        originalList.info = new ListNode(1);
        originalList.info.info = new ListNode(2);
        ListNode sortedList = mergeSort(originalList);
        printList(sortedList);
    }
}
