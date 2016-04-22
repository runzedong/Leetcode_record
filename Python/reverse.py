class ListNode(object):
	"""docstring for ListNode"""
	def __init__(self, x):
		self.val=x
		self.next=None #.val .next obeject's property. 类似于struct.中值或者属性。
	def next_node(self, nxtnode):
		self.next=nxtnode #封装next 方法

class Opeation(object):	
	def reverse(self, head):
		"""
		:type head:ListNode
		:rtype head
		"""
	#the following operatino is to reverse the linked list
		prev=ListNode(None)
		nxt=ListNode(None)
		curr=ListNode(None)
		curr=head
		prev=None
		while curr!=None:
			nxt=curr.next
			curr.next=prev
			prev=curr
			curr=nxt
		head=prev
		return head
	def show_case(self, head):
		while head:
			print(head.val)
			head=head.next
n1=ListNode(3)
n2=ListNode(6)
n3=ListNode(7)
n4=ListNode(9)
n5=ListNode(12)
n1.next_node(n2)
n2.next_node(n3)
n3.next_node(n4)
n4.next_node(n5)
test=Opeation()
test.show_case(n1)
print('lets reverse!')
new_head=ListNode(None)
new_head=test.reverse(n1)
test.show_case(new_head)