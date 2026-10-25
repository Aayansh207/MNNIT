#include<stdio.h>
#include<stdlib.h>
struct Node{
  struct Node* next;
  int val;
};

struct Node* insert_at_last(struct Node* head, int data){
  struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
  newnode->next=NULL;
  newnode->val=data;
  if(head==NULL){
    return newnode;
  }
  struct Node* temp=head;
  while(temp->next) temp=temp->next;
  temp->next=newnode;
  return head;
}

struct Node* insert_before_x(struct Node* head, int data, int x){
  struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
  newnode->val=data;
  if(head==NULL){printf("Blank linked list");return head;}
  struct Node* temp=head;
  struct Node* prev;
  while(temp->val!=x && temp->next){prev=temp;temp=temp->next;}
  if(!temp->next && temp->val!=x){printf("x not found in the list");return head;}
  prev->next=newnode;
  newnode->next=temp;
  return head;
}

struct Node* insert_after_x(struct Node* head, int data, int x){
  struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
  newnode->val=data;
  if(head==NULL){printf("Blank linked list");return head;}
  struct Node* temp=head;
  while(temp->val!=x && temp->next){temp=temp->next;}
  if(!temp->next){printf("x not found in the list");return head;}
  newnode->next=temp->next;
  temp->next=newnode;
  return head;
}

struct Node* delete_head(struct Node* head){
  if(head==NULL){printf("Blank linked list");return head;}
  struct Node* ans=head->next;
  free(head);
  return ans;
}

struct Node* delete_end(struct Node* head){
  if(head==NULL){printf("Blank linked list");return head;}
  struct Node* temp=head;
  struct Node* prev;
  while(temp->next){prev=temp;temp=temp->next;}
  prev->next=NULL;
  free(temp);
  return head;
}

struct Node* delete_x(struct Node* head, int x){
  if(head==NULL){printf("Blank linked list");return head;}
  struct Node* temp=head;
  struct Node* prev;
  while(temp->val!=x && temp->next){prev=temp;temp=temp->next;}
  if(!temp->next && temp->val!=x){printf("x not found in the list");return head;}
  prev->next=temp->next;
  free(temp);
  return head;
}

void printll(struct Node* head){
  if(head==NULL){printf("Blank linked list");return;}
  struct Node* temp=head;
  while(temp){
    printf("%d ",temp->val);
    temp=temp->next;
  }
  printf("\n");
}

int main(){
  struct Node* head=NULL;
  printf("Enter the number of elements in the linked list ");
  int n;
  scanf("%d",&n);
  printf("Enter the elements of the linked list space seperated ");
  for(int i=0;i<n;i++){
    int k;
    scanf("%d",&k);
    head=insert_at_last(head,k);
  }
  printll(head);
  printf("Enter the element before which you want to insert : ");
  int x;
  scanf("%d",&x);
  printf("Enter the element which you want to insert : ");
  int k;
  scanf("%d",&k);
  head=insert_before_x(head,k,x);
  printll(head);
  printf("Enter the element after which you want to insert : ");
  scanf("%d",&x);
  printf("Enter the element which you want to insert : ");
  scanf("%d",&k);
  head=insert_after_x(head,k,x);
  printll(head);
  printf("Deleting the head : ");
  head=delete_head(head);
  printll(head);
  printf("Deleting the end : ");
  head=delete_end(head);
  printll(head);
  printf("Enter the element you want to delete : ");
  scanf("%d",&x);
  head=delete_x(head,x);
  printll(head);
  return 0;
}
