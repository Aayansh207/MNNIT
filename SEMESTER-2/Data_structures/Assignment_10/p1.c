#include<stdio.h>
#include<stdlib.h>

struct Node{int d; struct Node *l,*r;};

int find(int a[],int s,int e,int x){
    for(int i=s;i<=e;i++) if(a[i]==x) return i;
}

struct Node* build(int pre[],int in[],int s,int e,int *pi){
    if(s>e) return NULL;
    struct Node* n=malloc(sizeof(*n));
    n->d=pre[(*pi)++]; n->l=n->r=NULL;
    int i=find(in,s,e,n->d);
    n->l=build(pre,in,s,i-1,pi);
    n->r=build(pre,in,i+1,e,pi);
    return n;
}

void post(struct Node* r){
    if(r){ post(r->l); post(r->r); printf("%d ",r->d); }
}

int main(){
    int in[]={4,2,1,7,5,8,3,6}, pre[]={1,2,4,3,5,7,8,6}, n=8, i=0;
    struct Node* r=build(pre,in,0,n-1,&i);
    post(r);
    printf("\n");
}
