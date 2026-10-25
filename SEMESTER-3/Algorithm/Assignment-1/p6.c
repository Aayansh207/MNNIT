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
    while(head){
        printf("%d ",head->val);
        head=head->next;
    }
}

struct node*reverseK(struct node*head,int k){
    struct node*dummy=(struct node*)malloc(sizeof(struct node));
    dummy->next=head;
    struct node*prev=dummy,*curr,*next;
    struct node*check;
    while(1){
        check=prev;
        for(int i=0;i<k&&check;i++){check=check->next;}
        if(!check){break;}
        curr=prev->next;
        next=curr->next;
        for(int i=1;i<k;i++){
            curr->next=next->next;
            next->next=prev->next;
            prev->next=next;
            next=curr->next;
        }
        prev=curr;
    }
    return dummy->next;
}

int main(){
    int n,k,x;
    scanf("%d",&n);
    struct node*head=(struct node*)malloc(sizeof(struct node));
    head->next=NULL;
    struct node*tail=head;
    while(n--){
        scanf("%d",&x);
        tail->next=createNode(x);
        tail=tail->next;
    }
    scanf("%d",&k);
    head->next=reverseK(head->next,k);
    printList(head->next);
    return 0;
}

