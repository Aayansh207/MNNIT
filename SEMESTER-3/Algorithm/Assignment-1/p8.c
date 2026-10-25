#include<stdio.h>

#define MAX 100

int stack[MAX],minStack[MAX];
int top=-1,minTop=-1;

void push(int x){
    stack[++top]=x;
    if(minTop==-1 || x<=minStack[minTop]){minStack[++minTop]=x;}
}

int pop(){
    if(top==-1){printf("Stack empty\n");return -1;}
    int x=stack[top--];
    if(x==minStack[minTop]){minTop--;}
    return x;
}

int peek(){
    if(top==-1){printf("Stack empty\n");return -1;}
    return stack[top];
}

int getMin(){
    if(minTop==-1){printf("Stack empty\n");return -1;}
    return minStack[minTop];
}

int main(){
    int n,x;
    scanf("%d",&n);
    while(n--){
        scanf("%d",&x);
        push(x);
    }
    printf("Top: %d\n",peek());
    printf("Minimum: %d\n",getMin());
    printf("Popped: %d\n",pop());
    printf("Minimum: %d\n",getMin());
    return 0;
}

