#include <stdio.h>
#include <stdlib.h>

struct Node {
    int productID;
    struct Node* next;
};
struct Node* insert_end(struct Node* head, int id) {
    struct Node* newnode = (struct Node*)malloc(sizeof(struct Node));
    newnode->productID = id;
    newnode->next = NULL;
    if (head==NULL) return newnode;
    struct Node* temp=head;
    while (temp->next)
        temp=temp->next;
    temp->next=newnode;
    return head;
}
struct Node* concatenate_lists(struct Node* list1, struct Node* list2) {
    if(list1==NULL)return list2;
    struct Node* temp=list1;
    while (temp->next)temp=temp->next;
    temp->next=list2;
    return list1;
}
void display(struct Node* head) {
    struct Node* temp = head;
    while(temp){
        printf("%d ",temp->productID);
        temp=temp->next;
    }
    printf("\n");
}
int main() {
    struct Node* list1=NULL;
    struct Node* list2=NULL;
    list1 = insert_end(list1,1);
    list1 = insert_end(list1,2);
    list1 = insert_end(list1,3);
    list2 = insert_end(list2,4);
    list2 = insert_end(list2,5);
    printf("Category 1 Products:\n");
    display(list1);
    printf("Category 2 Products:\n");
    display(list2);
    list1 = concatenate_lists(list1, list2);
    printf("\nCombined Product List:\n");
    display(list1);
    return 0;
}

