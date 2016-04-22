# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """


    def merge_two_list(self, l1, l2):
        """
        :list1 ListNode
        :list2 ListNode
        :rtype head-ListNode
        """
        print('now merge_two_list get starting')
        head=ListNode(None)
        curr=head
        while True:
            if not l1:
                curr.next=l2
                break
            if not l2:
                curr.next=l1
                break
            if l1.val<l2.val:
                curr.next=l1
                l1=l1.next
            else:
                curr.next=l2
                l2=l2.next
            curr=curr.next
        while head.next!=None:
            print(head.next.val)
            head=head.next
        return head.next

    def show_result(self,n1,na):
        while n1!=None:
            print(n1.val)
            n1=n1.next
        print('************')
        while na!=None:
            print(na.val)
            na=na.next
        new_head=ListNode(None)
        new_head=self.merge_two_list(n1,na)# 参数传递问题？
        while new_head!=None:
            print(new_head.val,end=' ')
            new_head=new_head.next
n1=ListNode(3)
n2=ListNode(6)
n3=ListNode(7)
n4=ListNode(9)
n1.next=n2
n2.next=n3
n3.next=n4
na=ListNode(2)
nb=ListNode(5)
nc=ListNode(8)
nd=ListNode(8)
na.next=nb
nb.next=nc
nc.next=nd
test=Solution()
test.show_result(n1,na)


