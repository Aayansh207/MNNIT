#include<stdio.h>
#include<stdlib.h>

struct node{
  int val;
  struct node* next;
};

void printList(struct node *head) {
    struct node *temp=head;
    while(temp){
        printf("%d ",temp->val);
        temp=temp->next;
    }
    printf("\n");
}

int main(){
  struct node* head=(struct node*)malloc(sizeof(struct node));
  struct node* mover=head;
  for(int i=1;i<10;i++){
    struct node* temp=(struct node*)malloc(sizeof(struct node));
    temp->val=i;
    mover->next=temp;
    mover=mover->next;
  }
  int n=5;
  int val;
  scanf("%d",&val);
  mover=head;
  while(n--){
    mover=mover->next;
  }
  struct node* temp=(struct node*)malloc(sizeof(struct node));
  temp->val=val;
  temp->next=mover->next;
  mover->next=temp;
  printList(head->next);
}
