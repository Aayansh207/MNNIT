#include<stdio.h>

#define BLOCK_SIZE 32
#define POOL_SIZE 10

union Block{
    struct{union Block*next;}freeNode;
    char payload[BLOCK_SIZE];
};

union Block pool[POOL_SIZE];
union Block*freeList;

void pool_init(){
    int i;
    for(i=0;i<POOL_SIZE-1;i++)pool[i].freeNode.next=&pool[i+1];
    pool[POOL_SIZE-1].freeNode.next=NULL;
    freeList=&pool[0];
}

void*pool_malloc(){
    union Block*b;
    if(freeList==NULL)return NULL;
    b=freeList;
    freeList=freeList->freeNode.next;
    return b;
}

void pool_free(void*ptr){
    union Block*b;
    if(ptr==NULL)return;
    b=(union Block*)ptr;
    b->freeNode.next=freeList;
    freeList=b;
}

int main(){
    union Block*p1,*p2;
    pool_init();
    p1=(union Block*)pool_malloc();
    p2=(union Block*)pool_malloc();
    if(p1)sprintf(p1->payload,"Hello");
    if(p2)sprintf(p2->payload,"World");
    printf("%s %s\n",p1->payload,p2->payload);
    pool_free(p1);
    pool_free(p2);
    return 0;
}

