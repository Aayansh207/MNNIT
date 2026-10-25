#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node {
    char title[50];
    struct Node* next;
};
struct Node* insert_end(struct Node* head, char title[]) {
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    strcpy(newnode->title,title);
    newnode->next=NULL;
    if (head==NULL) return newnode;
    struct Node* temp=head;
    while(temp->next)temp=temp->next;
    temp->next=newnode;
    return head;
}
int isPalindrome(struct Node* head) {
    char titles[100][50];
    int count = 0;
    struct Node* temp=head;
    while(temp!=NULL){
        strcpy(titles[count],temp->title);
        count++;
        temp=temp->next;
    }
    int start=0,end=count-1;
    while(start<end){
        if(strcmp(titles[start],titles[end])!=0) return 0;
        start++;
        end--;
    }
    return 1;
}
void display(struct Node* head){
    struct Node* temp=head;
    while(temp){
        printf("%s ",temp->title);
        temp = temp->next;
    }
    printf("\n");
}
int main(){
    struct Node* head=NULL;
    head=insert_end(head,"Data");
    head=insert_end(head,"Structures");
    head=insert_end(head,"Algorithms");
    head=insert_end(head,"Structures");
    head=insert_end(head,"Data");
    printf("Book Titles List:\n");
    display(head);
    if (isPalindrome(head)) printf("\nThe list of book titles is a PALINDROME\n");
    else printf("\nThe list of book titles is NOT a PALINDROME\n");
    return 0;
}

