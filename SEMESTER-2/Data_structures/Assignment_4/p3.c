#include <stdio.h>
#include <stdlib.h>

struct Node{
    int customerID;
    struct Node* next;
};
struct Node* insert_end(struct Node* head,int id){
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->customerID=id;
    newnode->next=NULL;
    if(head==NULL)return newnode;
    struct Node* temp=head;
    while (temp->next)temp=temp->next;
    temp->next=newnode;
    return head;
}
void removeDuplicates(struct Node* head){
    if(head==NULL) return;
    struct Node* current=head;
    while(current->next!=NULL){
        if(current->customerID==current->next->customerID){
            struct Node* duplicate=current->next;
            current->next=duplicate->next;
            free(duplicate);
        }
        else current=current->next;
    }
}
void display(struct Node* head){
    struct Node* temp=head;
    while(temp){
        printf("%d ",temp->customerID);
        temp=temp->next;
    }
    printf("\n");
}
int main(){
    struct Node* head=NULL;
    head = insert_end(head,101);
    head = insert_end(head,101);
    head = insert_end(head,102);
    head = insert_end(head,103);
    head = insert_end(head,103);
    head = insert_end(head,104);
    printf("Before removing duplicates:\n");
    display(head);
    removeDuplicates(head);
    printf("\nAfter removing duplicates:\n");
    display(head);
}

