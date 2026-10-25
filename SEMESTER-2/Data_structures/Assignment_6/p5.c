#include<stdio.h>
#define MAX 100
int q[MAX],front=-1,rear=-1;
void insert(int x){
    if(rear==MAX-1) printf("Queue Full\n");
    else{
        if(front==-1) front=0;
        q[++rear]=x;
    }
}
void del(){
    if(front==-1||front>rear) printf("Queue Empty\n");
    else printf("Deleted: %d\n",q[front++]);
}
void display(){
    int i;
    if(front==-1||front>rear) printf("Queue Empty\n");
    else{
        for(i=front;i<=rear;i++) printf("%d ",q[i]);
        printf("\n");
    }
}
int main(){
    int ch,x;
    while(1){
        printf("\n1.Insert 2.Delete 3.Display 4.Exit\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:scanf("%d",&x);insert(x);break;
            case 2:del();break;
            case 3:display();break;
            case 4:return 0;
        }
    }
    printf("\n");
}
