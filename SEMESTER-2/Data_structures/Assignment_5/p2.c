#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};
struct Node* head=NULL;
void create(int val){
    struct Node* n=malloc(sizeof(struct Node));
    n->data=val;
    if(head==NULL){head=n;n->next=head;return;}
    struct Node* t=head;
    while(t->next!=head)t=t->next;
    t->next=n;
    n->next=head;
}

void insertBeg(int val){
    struct Node* n=malloc(sizeof(struct Node));
    n->data=val;
    if(head==NULL){head=n;n->next=head;return;}
    struct Node* t=head;
    while(t->next!=head)t=t->next;
    n->next=head;
    t->next=n;
    head=n;
}
void insertEnd(int val){create(val);}
void deleteBeg(){
    if(head==NULL)return;
    if(head->next==head){free(head);head=NULL;return;}
    struct Node* t=head,*last=head;
    while(last->next!=head)last=last->next;
    head=head->next;
    last->next=head;
    free(t);
}

void traverse(){
    if(head==NULL)return;
    struct Node* t=head;
    do{printf("%d ",t->data);
      t=t->next;}
    while(t!=head);
    printf("\n");
}

void search(int key){
    if(head==NULL)return;
    struct Node* t=head;int pos=1;
    do{
        if(t->data==key){printf("Found at %d\n",pos);return;}
        t=t->next;pos++;
    }while(t!=head);
    printf("Not Found\n");
}

void sort(){
    if(head==NULL)return;
    struct Node *i,*j;int temp;
    for(i=head;i->next!=head;i=i->next)
        for(j=i->next;j!=head;j=j->next)
            if(i->data>j->data){
              temp=i->data;
              i->data=j->data;
              j->data=temp;
            }
}

void update(int old,int newv){
    if(head==NULL)return;
    struct Node* t=head;
    do{
        if(t->data==old){t->data=newv;return;}
        t=t->next;
    }while(t!=head);
}

int main(){
    int ch,val,old,newv;
    while(1){
        printf("\n1.Create\n2.InsertBeg\n3.InsertEnd\n4.DeleteBeg\n5.Traverse\n6.Search\n7.Sort\n8.Update\n9.Exit\nChoice:");
        scanf("%d",&ch);
        switch(ch){
            case 1:printf("Val:");scanf("%d",&val);create(val);break;
            case 2:printf("Val:");scanf("%d",&val);insertBeg(val);break;
            case 3:printf("Val:");scanf("%d",&val);insertEnd(val);break;
            case 4:deleteBeg();break;
            case 5:traverse();break;
            case 6:printf("Search:");scanf("%d",&val);search(val);break;
            case 7:sort();break;
            case 8:printf("Old New:");scanf("%d%d",&old,&newv);update(old,newv);break;
            case 9:return 0;
            default:printf("Invalid\n");
        }
    }
}

