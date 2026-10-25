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
    int n,x,sum;
    scanf("%d",&n);
    struct node*head=(struct node*)malloc(sizeof(struct node));
    head->next=NULL;
    struct node*tail=head;
    while(n--){
        scanf("%d",&x);
        struct node*temp=createNode(x);
        tail->next=temp;
        tail=temp;
    }
    scanf("%d",&sum);
    int found=0;
    for(struct node*i=head->next;i;i=i->next){
        for(struct node*j=i->next;j;j=j->next){
            if(i->val+j->val==sum){
                printf("(%d,%d)\n",i->val,j->val);
                found=1;
            }
        }
    }
    if(!found){printf("No pair found");}

    return 0;
}

