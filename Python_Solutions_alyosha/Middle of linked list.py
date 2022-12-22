# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        n = 0
        c = 0
        current = head
        while current:
            current = current.next
            n += 1
    
        current = head
        for i in range(n//2):
            current = current.next
        return current
        
        
        
        
            
            
       
        
        