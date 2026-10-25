#include <stdio.h>
#include <stdlib.h>

struct node{
    int coef,exp;
    struct node* next;
};
struct node* insert(struct node* head,int c,int e){
    struct node *new=(struct node*)malloc(sizeof(struct node));
    new->coef=c; new->exp=e; new->next=head;
    return new;
}
struct node* create(){
    int n,c,e,i;
    struct node* head=NULL;
    printf("No. of terms: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d%d",&c,&e);
        head=insert(head,c,e);
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
struct node* multiply(struct node* p1,struct node* p2){
    struct node *res=NULL;
    struct node *a,*b;
    for(a=p1;a;a=a->next)
        for(b=p2;b;b=b->next)
            res=insert(res,a->coef*b->coef,a->exp+b->exp);
    return res;
}
int main(){
    struct node *p1,*p2,*mul;
    printf("Enter polynomial 1 (coef exp):\n");
    p1=create();
    printf("Enter polynomial 2 (coef exp):\n");
    p2=create();
    mul=multiply(p1,p2);
    printf("Result: ");
    display(mul);
    printf("\n");
}
