#include<stdio.h>
#include<stdlib.h>

struct node{
    int val;
    struct node*next;
};

struct node*createNode(int val){
    struct node*temp=(struct node*)malloc(sizeof(struct node));
    temp->val=val;
    temp->next=NULL;
    return temp;
}

void printList(struct node*head){
    while(head!=NULL){
        printf("%d ",head->val);
        head=head->next;
    }
    printf("\n");
}

int main(){
    int n;
    scanf("%d",&n);

    struct node*head=(struct node*)malloc(sizeof(struct node));
    head->next=NULL;
    struct node*tail=head;
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        struct node*temp=createNode(x);
        tail->next=temp;
        tail=temp;
    }

    struct node*curr=head->next;
    while(curr!=NULL){
        struct node*prev=curr;
        struct node*nextNode=curr->next;
        while(nextNode!=NULL){
            if(nextNode->val==curr->val){
                prev->next=nextNode->next;
                free(nextNode);
                nextNode=prev->next;
            }
            else{
                prev=nextNode;
                nextNode=nextNode->next;
            }
        }
        curr=curr->next;
    }
    printList(head->next);
    return 0;
}

