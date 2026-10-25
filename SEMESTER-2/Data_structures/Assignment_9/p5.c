#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *left,*right;
};

struct Node* newNode(int data){
    struct Node* n=(struct Node*)malloc(sizeof(struct Node));
    n->data=data;
    n->left=n->right=NULL;
    return n;
}

void levelOrder(struct Node* root){
    if (!root) return;
    struct Node* queue[100];
    int front=0,rear=0;
    queue[rear++]=root;
    while(front<rear){
        struct Node* temp=queue[front++];
        printf("%d ",temp->data);
        if(temp->left)
            queue[rear++]=temp->left;
        if(temp->right)
            queue[rear++]=temp->right;
    }
}

int main(){
    struct Node* root=newNode(1);
    root->left=newNode(2);
    root->right=newNode(3);
    root->left->left=newNode(4);
    printf("Level-order traversal: ");
    levelOrder(root);
    printf("\n");
    return 0;
}
