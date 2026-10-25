#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node *l,*r;};

struct Node* ins(struct Node* r,int x){
    if(!r){ r=malloc(sizeof(*r)); r->d=x; r->l=r->r=NULL; return r; }
    if(x<r->d) r->l=ins(r->l,x);
    else r->r=ins(r->r,x);
    return r;
}

struct Node* min(struct Node* r){
    while(r->l) r=r->l; return r;
}

struct Node* del(struct Node* r,int x){
    if(!r) return r;
    if(x<r->d) r->l=del(r->l,x);
    else if(x>r->d) r->r=del(r->r,x);
    else{
        if(!r->l) return r->r;
        if(!r->r) return r->l;
        struct Node* t=min(r->r);
        r->d=t->d;
        r->r=del(r->r,t->d);
    }
    return r;
}

void in(struct Node* r){ if(r){ in(r->l); printf("%d ",r->d); in(r->r);} }
void pre(struct Node* r){ if(r){ printf("%d ",r->d); pre(r->l); pre(r->r);} }
void post(struct Node* r){ if(r){ post(r->l); post(r->r); printf("%d ",r->d);} }

int main(){
    struct Node* r=NULL;
    r=ins(r,50); ins(r,30); ins(r,70); ins(r,20); ins(r,40);
    r=del(r,30);
    in(r); printf("\n"); pre(r); printf("\n"); post(r);
    printf("\n");
}
