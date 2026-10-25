#include <stdio.h>
int queue[100];
int front=0,rear=-1,size=0;

void enqueue(int x){
    if(size==100)return;
    rear=(rear+1)%100;
    queue[rear]=x;
    size++;
}

int dequeue(){
    int x=queue[front];
    front=(front+1)%100;
    size--;
    return x;
}

void display(){
    int i,idx=front;
    for(i=0;i<size;i++){
        printf("%d ",queue[idx]);
        idx=(idx+1)%100;
    }
    printf("\n");
}

void reverseFirstK(int k){
    int stack[100],top=-1;
    int i,n=size;
    for(i=0;i<k;i++){stack[++top]=dequeue();}
    while(top!=-1){enqueue(stack[top--]);}
    for(i=0;i<n-k;i++){enqueue(dequeue());}
}

int main(){
    int n,k,i,x;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    printf("Enter queue elements: ");
    for(i=0;i<n;i++){scanf("%d",&x);enqueue(x);}
    printf("Enter k: ");
    scanf("%d",&k);
    reverseFirstK(k);
    printf("Queue after reversing first %d elements: ",k);
    display();
    return 0;
}