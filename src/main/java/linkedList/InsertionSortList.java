package linkedList;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode unsortedArray = head.next;
        ListNode prev = head;
        while (unsortedArray != null){
            // get rid of node at unsortedArray
            int temp = unsortedArray.val;
            unsortedArray = unsortedArray.next;
            prev.next = unsortedArray;
            ListNode curr = head;
            int index = 0;
            boolean foundPos = false;
            while (curr!=unsortedArray){
                if (curr.val > temp && !foundPos){
                    foundPos = true;
                    head = insertAtindex(head,index,temp);
                }
                if (curr.next == unsortedArray){
                    prev = curr;
                    if (!foundPos){
                        // insert at end of sorted list
                        head = insertAtindex(head,index+1,temp);
                        prev = prev.next;
                        break;
                    }
                }
                curr = curr.next;
                index++;
            }
        }
        return head;

    }


    private ListNode insertAtindex(ListNode head,int index,int value){
        ListNode nodeToBeInserted = new ListNode(value);
        if (index == 0){
            nodeToBeInserted.next = head;
            head = nodeToBeInserted;
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while (curr.next !=null && count < (index-1)){
            curr = curr.next;
            count++;
        }

        // element inserted at nodes end
        if (curr.next == null){
            curr.next = nodeToBeInserted;
            nodeToBeInserted.next = null;
            return head;
        }
        ListNode next = curr.next;
        curr.next = nodeToBeInserted;
        nodeToBeInserted.next = next;
        return head;
    }
}
