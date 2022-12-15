# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        i = head
        k = head
        j = 1
        while head:
            count += 1
            head = head.next
        x = count - n
        while j < x:
            j += 1
            i = i.next
        
        if n != count:
            i.next = i.next.next
            return k
        else:
            
            return i.next
            