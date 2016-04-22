import java.util.*;

public class mergeTwoLists {
	static class ListNode {
	private int val;
	private ListNode next;
	public ListNode(int x){
		this.val=x;
		this.next=null;
	}
}
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode n1=new ListNode(3);
		ListNode n2=new ListNode(4);
		ListNode n3=new ListNode(4);
		ListNode n4=new ListNode(5);
		ListNode n5=new ListNode(7);
		l1.next=n1;
		n1.next=n2;
		l2.next=n3;
		n3.next=n4;
		n4.next=n5;
		mergeTwoLists tester=new mergeTwoLists();
		ListNode newL=tester.mergeTwoListsInplace(l1,l2);
		while (newL!=null){
			System.out.println(newL.val);
			newL=newL.next;
		}
	}
// in place change based on linkedlist l1 as head of new merged list
	public ListNode mergeTwoListsInplace(ListNode l1, ListNode l2){
		ListNode head=new ListNode(0);
		head.next=l1;
		ListNode pre=head;
		while (l1!=null && l2!=null){
			if (l1.val<=l2.val){
				l1=l1.next;
				//System.out.println("l1 less than l2");
			}
			else{
				ListNode next=l2.next;
				l2.next=pre.next;
				pre.next=l2;
				l2=next;
				//System.out.println("l1 less than l2");
			}
			pre=pre.next;
		}
		if (l2!=null){
			pre.next=l2;
		}
		return head.next;
	}
// creat an new linked list and merge from l1, and l2
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode head=new ListNode(0);
		ListNode curr=head;
		ListNode temp;
		while(l1!=null && l2!=null){
			if (l1.val<=l2.val){
				temp= new ListNode(l1.val);
				curr.next=temp;
				l1=l1.next;
			}
			else{
				temp= new ListNode(l2.val);
				curr.next=temp;
				l2=l2.next;
			}
			curr=temp;
		}
		while (l1!=null){
			temp=new ListNode(l1.val);
			curr.next=temp;
			l1=l1.next;
			curr=temp;
		}
		while (l2!=null){
			temp=new ListNode(l2.val);
			curr.next=temp;
			l2=l2.next;
			curr=temp;
		}
		return head.next;
	}
}
