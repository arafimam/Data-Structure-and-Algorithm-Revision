package linkedList;

public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // find which node to remove
        // 1->2->3->4->5.
        // size = 5
        // 5 - (2-1) = 4
        if (head == null){
            return null;
        }
        int positionOfNodeToBeRemoved = getPositionOfNodeToRemove(head,n);
        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        while (curr != null){
            if (count == positionOfNodeToBeRemoved-1){
                prev = curr;
            }
            if (count == positionOfNodeToBeRemoved){
                break;
            }
            count++;
            curr = curr.next;
        }
        ListNode next = curr.next;
        // prev and next is not null

        //prev is null if the first element is to be removed
        if (prev == null && next != null){
            // curr is the first element.
            head = head.next;
            return head;
        }
        // next is null if the last element is to be removed.
        if (next == null && prev!=null){
            prev.next = null;
            return head;
        }

        // next and prev is both null then curr is the only element in the list
        if (next == null && prev == null){
            return null;
        }
        prev.next = next;
        curr.next = null;
        return head;

    }

    public int getPositionOfNodeToRemove(ListNode head,int n){
        ListNode curr = head;
        int size = 0;
        while (curr!=null){
            size = size + 1;
            curr = curr.next;
        }
        return (size-n);
    }
}
