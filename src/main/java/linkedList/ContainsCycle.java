package linkedList;

import java.util.HashSet;
import java.util.Set;

public class ContainsCycle {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> seenNodes = new HashSet<>();
        while (curr!=null){
            if (seenNodes.contains(curr)){
                return true;
            }else{
                seenNodes.add(curr);
                curr = curr.next;
            }
        }
        return false;

    }
}
