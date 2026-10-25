#include <stdio.h>
#define SIZE 100

int arr[SIZE];
int top1=-1,top2=SIZE;

void push1(int x){
    if(top1+1==top2){
        printf("Stack Overflow\n");
        return;
    }
    arr[++top1]=x;
}

void push2(int x){
    if(top1+1==top2){
        printf("Stack Overflow\n");
        return;
    }
    arr[--top2]=x;
}

int pop1(){
    if(top1==-1){
        printf("Stack 1 Underflow\n");
        return -1;
    }
    return arr[top1--];
}

int pop2(){
    if(top2==SIZE){
        printf("Stack 2 Underflow\n");
        return -1;
    }
    return arr[top2++];
}

void display(){
    printf("Stack1: ");
    for(int i=0;i<=top1;i++) printf("%d ",arr[i]);
    printf("\nStack2: ");
    for(int i=SIZE-1;i>=top2;i--) printf("%d ",arr[i]);
    printf("\n");
}

int main(){
    push1(10);
    push1(20);
    push2(100);
    push2(200);
    display();
    printf("Pop Stack1: %d\n",pop1());
    printf("Pop Stack2: %d\n",pop2());
    display();
    return 0;
}
