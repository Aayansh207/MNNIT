#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* createNode(int x){
    struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=x;
    newNode->next=NULL;
    return newNode;
}

void append(struct Node** head,int x){
    struct Node* temp=createNode(x);
    if(*head==NULL){
        *head=temp;
        return;
    }
    struct Node* curr=*head;
    while(curr->next) curr=curr->next;
    curr->next=temp;
}

void printList(struct Node* head){
    while(head){
        printf("%d ",head->data);
        head=head->next;
    }
    printf("\n");
}

struct Node* rotateK(struct Node* head,int k){
    if(!head||k<=1) return head;
    struct Node dummy;
    dummy.next=head;
    struct Node* prevGroupEnd=&dummy;
    while(1){
        struct Node* kth=prevGroupEnd;
        for(int i=0;i<k&&kth;i++) kth=kth->next;
        if(!kth) break;
        struct Node* groupStart=prevGroupEnd->next;
        struct Node* groupEnd=kth;
        struct Node* nextGroup=groupEnd->next;
        struct Node* secondLast=groupStart;
        while(secondLast->next!=groupEnd) secondLast=secondLast->next;
        secondLast->next=nextGroup;
        groupEnd->next=groupStart;
        prevGroupEnd->next=groupEnd;
        prevGroupEnd=secondLast;
    }
    return dummy.next;
}

int main(){
    struct Node* head=NULL;
    int arr[]={1,2,3,4,5,6,7,8,9},n=9;
    for(int i=0;i<n;i++) append(&head,arr[i]);
    printf("Original List:\n");
    printList(head);
    head=rotateK(head,3);
    printf("After Rotation (k=3):\n");
    printList(head);
    return 0;
}
