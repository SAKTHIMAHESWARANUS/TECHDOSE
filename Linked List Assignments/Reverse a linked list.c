/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode *reverseList(struct ListNode *head)
{
    struct ListNode *prevnode = 0;
    struct ListNode *current;
    struct ListNode *nextnode;
    current = nextnode = head;
    while (nextnode != 0)
    {
        nextnode = nextnode->next;
        current->next = prevnode;
        prevnode = current;
        current = nextnode;
    }
    head = prevnode;
    return head;
}
