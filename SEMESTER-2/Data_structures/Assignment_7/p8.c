#include <stdio.h>
#define MAX 10
int arr[MAX], top1=-1, top2=MAX;
void push1(int x){ if(top1<top2-1) arr[++top1]=x; }
void push2(int x){ if(top1<top2-1) arr[--top2]=x; }
int pop1(){ return arr[top1--]; }
int pop2(){ return arr[top2++]; }
int main(){
    push1(10); push1(20);
    push2(100); push2(200);
    printf("%d %d\n", pop1(), pop2());
}
