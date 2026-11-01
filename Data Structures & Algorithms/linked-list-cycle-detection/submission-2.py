# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        dummy = ListNode(0, head)
        faster = dummy
        slower = dummy

        while faster.next != None and faster.next.next != None:
            faster = faster.next.next
            slower = slower.next

            if faster == slower:
                return True

        return False