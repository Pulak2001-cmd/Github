# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dicts = {}
        while head != None:
            if head.val not in dicts:
                dicts[head.val] = 1
            else:
                dicts[head.val] += 1
            head = head.next
        lists = []
        for i in dicts:
            if dicts[i] == 1:
                lists.append(i)
        lists = sorted(lists)[::-1]
        root = None
        for i in lists:
            new_root = ListNode(i, root)
            root = new_root
        return root