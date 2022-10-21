/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {

	if (head == NULL) return NULL;

	if (left == right) return head;

	struct ListNode* prev = NULL;
	struct ListNode* curr = head;

	int index = 1;
	while (index < left)
	{
		prev = curr;
		curr = curr->next;
		index++;
	}

	struct ListNode* leftMinusOneNode = prev;

	struct ListNode* leftNode = curr;
	struct ListNode* next = NULL;

	while (left <= right)
	{
		next = curr->next;

		curr->next = prev;

		prev = curr;
		curr = next;
		left++;
	}

	if (leftMinusOneNode == NULL) 
		head = prev;
	else
		leftMinusOneNode->next = prev;   	
	leftNode->next = curr;

	return head;
}
