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

int main(){
    int n,x,pos;
    scanf("%d",&n);
    struct node*head=(struct node*)malloc(sizeof(struct node));
    head->next=NULL;
    struct node*tail=head,*loopNode=NULL;
    for(int i=1;i<=n;i++){
        scanf("%d",&x);
        struct node*temp=createNode(x);
        tail->next=temp;
        tail=temp;
        if(i==1){loopNode=temp;}
    }
    scanf("%d",&pos);
    if(pos!=0){
        loopNode=head->next;
        for(int i=1;i<pos;i++){loopNode=loopNode->next;}
        tail->next=loopNode;
    }
    struct node*slow=head->next;
    struct node*fast=head->next;
    while(fast&&fast->next){
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            printf("Loop detected");
            return 0;
        }
    }
    printf("No loop");
    return 0;
}

