#include<stdio.h>

int q1[100],q2[100];
int f1=0,r1=-1,f2=0,r2=-1;

void enqueue(int q[],int *r,int x){q[++(*r)]=x;}
int dequeue(int q[],int *f){return q[(*f)++];}
int empty(int f,int r){return f>r;}
void push(int x){
    enqueue(q2,&r2,x);
    while(!empty(f1,r1)){enqueue(q2,&r2,dequeue(q1,&f1));}
    for(int i=0;i<=r2;i++){q1[i]=q2[i];}
    f1=f2;r1=r2;f2=0;r2=-1;
}

int pop(){
    if(empty(f1,r1)){printf("Stack empty\n");return -1;}
    return dequeue(q1,&f1);
}

int peek(){
    if(empty(f1,r1)){printf("Stack empty\n");return -1;}
    return q1[f1];
}

int main(){
    int n,x;
    scanf("%d",&n);
    while(n--){
        scanf("%d",&x);
        push(x);
    }
    printf("Top: %d\n",peek());
    printf("Pop: %d\n",pop());
    printf("Pop: %d\n",pop());
    printf("Top: %d\n",peek());
    return 0;
}

