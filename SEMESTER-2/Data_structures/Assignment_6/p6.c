#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*next;
};

struct node*front=NULL,*rear=NULL;

void insert(int x){
    struct node*temp=malloc(sizeof(struct node));
    temp->data=x;
    temp->next=NULL;

    if(rear==NULL){
        front=rear=temp;
        return;
    }

    rear->next=temp;
    rear=temp;
}

void del(){
    if(front==NULL){printf("Queue Empty\n");return;}

    struct node*temp=front;
    printf("Deleted: %d\n",temp->data);
    front=front->next;

    if(front==NULL) rear=NULL;
    free(temp);
}

void display(){
    struct node*temp=front;
    while(temp){
        printf("%d ",temp->data);
        temp=temp->next;
    }
    printf("\n");
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
