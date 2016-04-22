#include <stdio.h>
#include <stdlib.h>
struct ListNode
{	int val;
	struct ListNode *next
};
// lets find out a recursive version
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    if(l1==NULL) return l2;
	if(l2==NULL) return l1;
	struct ListNode *head;
	if(l1->val<l2->val){
		head=l1;
		head->next=mergeTwoLists(l1->next,l2);
	}
	else{
		head=l2;
	    head->next=mergeTwoLists(l1,l2->next);
	}
	return head;
}

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
	if(l1==NULL) return l2;
	if(l2==NULL) return l1;
	struct ListNode *curr, *prev, *post, *head;
	if(l1->val<l2->val){
		head=prev=l1;
		post=l2
	}
	else{
		head=prev=l2;
		post=l1;
	}
	for(curr=prev->next;curr!=NULL;curr=prev->next){
		if(curr->val>post->val){
			prev->next=post;
			prev=post;
			post=curr;
			curr=prev->next;
		}
		else
			prev=curr;
	}
	if(post){
		prev->next=post;
	}
	return head;    
}