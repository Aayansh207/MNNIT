#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node* l;};

struct Node* ins(struct Node* r,int x){
    struct Node* n=malloc(sizeof(*n));
    n->d=x; n->l=r;
    return n;
}

void post(struct Node* r){
    if(r){ post(r->l); printf("%d ",r->d); }
}

int main(){
    int a[]={1,2,3,4,5}; struct Node* r=NULL;
    for(int i=0;i<5;i++) r=ins(r,a[i]);
    post(r);
    printf("\n");
}
