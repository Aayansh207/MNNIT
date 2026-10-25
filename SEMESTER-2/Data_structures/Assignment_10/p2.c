#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node *l,*r;};

int find(int a[],int s,int e,int x){
    for(int i=s;i<=e;i++) if(a[i]==x) return i;
}

struct Node* build(int post[],int in[],int s,int e,int *pi){
    if(s>e) return NULL;
    struct Node* n=malloc(sizeof(*n));
    n->d=post[(*pi)--]; n->l=n->r=NULL;
    int i=find(in,s,e,n->d);
    n->r=build(post,in,i+1,e,pi);
    n->l=build(post,in,s,i-1,pi);
    return n;
}

void inorder(struct Node* r){
    if(r){ inorder(r->l); printf("%d ",r->d); inorder(r->r); }
}

int main(){
    int in[]={4,2,1,7,5,8,3,6}, post[]={4,2,7,8,5,6,3,1}, n=8, i=n-1;
    struct Node* r=build(post,in,0,n-1,&i);
    inorder(r);
    printf("\n");
}
