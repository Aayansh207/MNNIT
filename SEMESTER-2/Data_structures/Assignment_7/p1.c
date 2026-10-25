#include <stdio.h>
#define MAX 7
void push(int S[], int *top, int x){ if(*top<MAX-1) S[++(*top)] = x; }
void pop(int *top){ if(*top>=0) (*top)--; }
void showS(int S[], int top){
    for(int i=0;i<=top;i++) printf("%d ",S[i]);
    printf("Top=%d\n",top);
}
void enqueue(int Q[], int *r, int x){
    if(*r==-1) Q[++(*r)] = x;
    else Q[++(*r)] = x;
}
void dequeue(int *f){ (*f)++; }
void showQ(int Q[], int f, int r){
    for(int i=f;i<=r;i++) printf("%d ",Q[i]);
    printf("\n");
}
int main(){
    int S[MAX]={99,20,4,27}, top=3;
    showS(S,top);
    push(S,&top,5); showS(S,top);
    push(S,&top,7); showS(S,top);
    pop(&top); showS(S,top);
    pop(&top); showS(S,top);
    pop(&top); showS(S,top);
    
    int Q[10], f=0, r=-1;
    enqueue(Q,&r,6);
    enqueue(Q,&r,8);
    enqueue(Q,&r,-1);
    dequeue(&f);
    enqueue(Q,&r,7);
    dequeue(&f);
    dequeue(&f);
    printf("Queue: ");
    showQ(Q,f,r);
    return 0;
}
