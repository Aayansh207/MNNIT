#include <stdio.h>
#include <stdlib.h>

struct node{
    int coef, exp;
    struct node* next;
};

struct node* create(){
    struct node *head=NULL,*temp,*new;
    int n,c,e,i;
    printf("No. of terms: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        new=(struct node*)malloc(sizeof(struct node));
        scanf("%d%d",&c,&e);
        new->coef=c; new->exp=e; new->next=NULL;
        if(head==NULL) head=temp=new;
        else{ temp->next=new; temp=new; }
    }
    return head;
}

void display(struct node* p){
    while(p){
        printf("%dx^%d",p->coef,p->exp);
        if(p->next) printf(" + ");
        p=p->next;
    }
}

struct node* add(struct node* p1,struct node* p2){
    struct node *res=NULL,*temp=NULL,*new;
    while(p1 && p2){
        new=(struct node*)malloc(sizeof(struct node));
        new->next=NULL;
        if(p1->exp==p2->exp){
            new->coef=p1->coef+p2->coef;
            new->exp=p1->exp;
            p1=p1->next; p2=p2->next;
        }
        else if(p1->exp>p2->exp){
            new->coef=p1->coef; new->exp=p1->exp;
            p1=p1->next;
        }
        else{
            new->coef=p2->coef; new->exp=p2->exp;
            p2=p2->next;
        }

        if(!res) res=temp=new;
        else{ temp->next=new; temp=new; }
    }
    return res;
}

int main(){
    struct node *p1,*p2,*sum;
    printf("Enter polynomial 1 (coef exp):\n");
    p1=create();
    printf("Enter polynomial 2 (coef exp):\n");
    p2=create();
    sum=add(p1,p2);
    printf("Result: ");
    display(sum);
}
