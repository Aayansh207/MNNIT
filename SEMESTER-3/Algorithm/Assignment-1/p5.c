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

struct node*merge(struct node*l1,struct node*l2){
    struct node*head=(struct node*)malloc(sizeof(struct node));
    head->next=NULL;
    struct node*tail=head;

    while(l1&&l2){
        if(l1->val<=l2->val){
            tail->next=l1;
            l1=l1->next;
        }
        else{
            tail->next=l2;
            l2=l2->next;
        }
        tail=tail->next;
    }

    if(l1) tail->next=l1;
    else tail->next=l2;

    return head->next;
}

int main(){
    int n,m,x;
    scanf("%d",&n);
    struct node*h1=(struct node*)malloc(sizeof(struct node));
    h1->next=NULL;
    struct node*t1=h1;
    while(n--){
        scanf("%d",&x);
        t1->next=createNode(x);
        t1=t1->next;
    }
    scanf("%d",&m);
    struct node*h2=(struct node*)malloc(sizeof(struct node));
    h2->next=NULL;
    struct node*t2=h2;
    while(m--){
        scanf("%d",&x);
        t2->next=createNode(x);
        t2=t2->next;
    }
    struct node*ans=merge(h1->next,h2->next);
    printList(ans);
    return 0;
}

