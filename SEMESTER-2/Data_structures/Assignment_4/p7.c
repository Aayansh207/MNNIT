#include <stdio.h>
#include <stdlib.h>

struct Node {
    int taskID;
    int priority;
    struct Node* next;
};
struct Node* insert_end(struct Node* head, int id, int priority){
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->taskID=id;
    newnode->priority=priority;
    newnode->next=NULL;
    if(head==NULL) return newnode;
    struct Node* temp=head;
    while(temp->next) temp=temp->next;
    temp->next=newnode;
    return head;
}
struct Node* reverse_list(struct Node* head) {
    struct Node* prev=NULL;
    struct Node* curr=head;
    struct Node* next=NULL;
    while(curr){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
void display(struct Node* head) {
    struct Node* temp=head;
    while(temp){
        printf("[Task %d | Priority %d] ",temp->taskID,temp->priority);
        temp=temp->next;
    }
    printf("\n");
}
int main() {
    struct Node* head=NULL;
    head=insert_end(head,1,5);
    head=insert_end(head,2,3);
    head=insert_end(head,3,4);
    head=insert_end(head,4,1);
    printf("Original Task Order:\n");
    display(head);
    head=reverse_list(head);
    printf("\nReversed Task Order:\n");
    display(head);
    return 0;
}

