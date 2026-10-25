#include <stdio.h>
#include <stdlib.h>

struct Node {
    int taskID;
    int priority;
    struct Node* next;
};
struct Node* insert_end(struct Node* head, int id, int priority) {
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->taskID=id;
    newnode->priority=priority;
    newnode->next=NULL;
    if (head==NULL) return newnode;
    struct Node* temp=head;
    while(temp->next)temp=temp->next;
    temp->next=newnode;
    return head;
}
void delete_alternate_nodes(struct Node* head) {
    if(head==NULL) return;
    struct Node* current=head;
    while(current && current->next){
        struct Node* temp=current->next;
        current->next=temp->next;
        free(temp);
        current=current->next;
    }
}
void display(struct Node* head) {
    struct Node* temp=head;
    while (temp){
        printf("[Task %d | Priority %d] ",temp->taskID,temp->priority);
        temp=temp->next;
    }
    printf("\n");
}
int main(){
    struct Node* head=NULL;
    head = insert_end(head,1,5);
    head = insert_end(head,2,3);
    head = insert_end(head,3,4);
    head = insert_end(head,4,1);
    head = insert_end(head,5,2);
    printf("Before deleting alternate tasks:\n");
    display(head);
    delete_alternate_nodes(head);
    printf("\nAfter deleting alternate tasks:\n");
    display(head);
    return 0;
}

