#include <stdio.h>
#include <stdlib.h>
struct ListNode 
{
	int val;
	struct ListNode *next;
};

struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
	struct ListNode *prev=head;
	struct ListNode *curr=head;
	//printf("%d\n",prev->val);
	int step=0;
	while(step<n&&curr!=NULL){
		curr=curr->next;
		step++;
	}
	//printf("%d\n",step); //for test
	if(step==n&&curr==NULL){
		struct ListNode *temp=NULL;		
		temp=head;
		head=head->next;
		free(temp);
		return head;
	}
	while(curr->next!=NULL){
		curr=curr->next;
		prev=prev->next;
	}
	struct ListNode* temp=prev->next;
	prev->next=temp->next;
	free(temp);
	return head;
}

void print_list(struct ListNode *head){
	struct ListNode *current=head;
	while(current!=NULL){
		printf("%d\n",current->val);
		current=current->next;
	}
}

int main(int argc, char const *argv[])
{
	struct ListNode *head=NULL;
	head = malloc(sizeof(struct ListNode));
	if (head==NULL){
		return 1;
	}

	head->val=1;
	head->next=NULL;

	head->next=malloc(sizeof(struct ListNode));
	head->next->val=2;
	head->next->next=NULL;	

	head->next->next=malloc(sizeof(struct ListNode));
	head->next->next->val=3;
	head->next->next->next=NULL;

	head->next->next->next=malloc(sizeof(struct ListNode));
	head->next->next->next->val=4;
	head->next->next->next->next=NULL;

	//removeNthFromEnd(head,4);
	struct ListNode *temp=NULL;		
	temp=head;
	head=head->next;
	free(temp);
	print_list(head);

	return 0;
}