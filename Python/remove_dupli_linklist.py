#definition for singly-linked list
class ListNode(object):
	def __init__(self,x):
		self.val=x
		self.next=None

class Solution(object):
	def deleteDuplicates(self,head):
		"""
		:type head:ListNode
		:rtype: ListNode
		"""
		if not head:
			return head
		flag=False
		prev=head
		curr=head.next
		while True:
			while curr and prev.val==curr.val:
				flag=True
				curr=curr.next
			if flag:
				prev.next=curr
				flag=False
			if not curr:
				break
			prev=curr
			curr=curr.next	
		return head
	def showlist(self,head):
		while head:
			print("the list is print below")
			print(head.val)
			head=head.next
n1=ListNode(1)
n2=ListNode(1)
n3=ListNode(1)
n1.next=n2
n2.next=n3
test=Solution()
test.showlist(n1)
new_res=ListNode(None)
new_res=test.deleteDuplicates(n1)
print("##########")
test.showlist(new_res)



