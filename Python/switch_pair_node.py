# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        """
        the following is a recursive method
        if not head or not head.next:
            return head
        first=head
        second=head.next
        third=second.next
        head=second
        second.next=first
        first.next=self.swapPairs(third)
        return head
        """
        dummy=ListNode(None)
        prev=ListNode(None)
        dummy.next=head
        prev=dummy
        #此处的dummy 传递的是reference。始终指向Head的位置
        print('No.1 the test for head %d'%dummy.next.val)
        while head and head.next:
            nxt=ListNode(None)
            nxt=head.next
            head.next=nxt.next
            nxt.next=head
            prev.next=nxt
            prev=head
            head=prev.next
            #the trick is after swap . head is indicated the second place <a->b(Head)->c>
            print('*******the prev after swap %d'%prev.val)
            print('*******the test for head %d'%head.val)
            print('#######the dummy points to %d'%dummy.next.val)
        return dummy.next
    def show_case(self, head):
        while head:
            print(head.val)
            head=head.next
n1=ListNode(3)
n2=ListNode(6)
n3=ListNode(7)
n4=ListNode(9)
n5=ListNode(12)
n1.next=n2
n2.next=n3
n3.next=n4
n4.next=n5
test=Solution()
test.show_case(l[0])
print('lets swap!')
new_head=ListNode(None)
new_head=test.swapPairs(l[0])
test.show_case(new_head)

