package linkedList;

public class MergeKSortedList {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for (int i=0;i<lists.length;i++){
            result = mergeTwoLists(result,lists[i]);
        }
        return result;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr = new ListNode(-1);
        ListNode result = curr ;
        while (list1!=null || list2!=null){
            if (list1 != null && list2!=null){
                if (list1.val < list2. val){
                    curr.next = list1;
                    list1 = list1.next;
                    curr = curr.next;
                }else{
                    curr.next = list2;
                    list2 = list2.next;
                    curr = curr.next;
                }
            }
            else if (list1 == null && list2!=null){
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
            else if (list2 == null && list1!=null){
                curr.next = list1;
                list1=list1.next;
                curr= curr.next;
            }


        }
        return result.next;
    }

}
