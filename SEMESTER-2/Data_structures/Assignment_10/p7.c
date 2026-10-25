#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node *l,*r;};

struct Node* n(int x){
    struct Node* t=malloc(sizeof(*t));
    t->d=x; t->l=t->r=NULL; return t;
}

int cnt(struct Node* r){ return r?1+cnt(r->l)+cnt(r->r):0; }

int leaf(struct Node* r){
    return !r?0:(!r->l&&!r->r)?1:leaf(r->l)+leaf(r->r);
}

int nonleaf(struct Node* r){
    return (!r||(!r->l&&!r->r))?0:1+nonleaf(r->l)+nonleaf(r->r);
}

int h(struct Node* r){
    if(!r) return -1;
    int l=h(r->l), rr=h(r->r);
    return 1+(l>rr?l:rr);
}

int strict(struct Node* r){
    if(!r) return 1;
    if((r->l&&!r->r)||(!r->l&&r->r)) return 0;
    return strict(r->l)&&strict(r->r);
}

int main(){
    struct Node* r=n(1); r->l=n(2); r->r=n(3);
    printf("%d %d %d %d %d",cnt(r),leaf(r),nonleaf(r),h(r),strict(r));
    printf("\n");
}
