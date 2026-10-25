#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node* r;};

struct Node* ins(struct Node* root,int x){
    struct Node* n=malloc(sizeof(*n)); n->d=x; n->r=NULL;
    if(!root) return n;
    struct Node* t=root;
    while(t->r) t=t->r;
    t->r=n;
    return root;
}

void in(struct Node* r){
    while(r){ printf("%d ",r->d); r=r->r; }
}

int main(){
    int a[]={1,2,3,4,5}; struct Node* r=NULL;
    for(int i=0;i<5;i++) r=ins(r,a[i]);
    in(r);
    printf("\n");
}
