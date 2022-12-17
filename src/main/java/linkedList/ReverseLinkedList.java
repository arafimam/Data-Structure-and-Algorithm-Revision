package linkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while (curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;
    }


}
