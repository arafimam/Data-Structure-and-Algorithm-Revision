package linkedList;

public class RemoveNNodesAfterMNodes {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode curr = head;
        while (curr != null){
            int count = 1;
            while (count < m && curr!= null){
                curr = curr.next;
                count++;
            }
            count = 1;
            if (curr == null){
                return head;
            }
            ListNode removes = curr.next;
            while (count <= n && removes!=null){
                removes = removes.next;
                count++;
            }
            curr.next = removes;
            curr = curr.next;
        }
        return head;
    }
}
