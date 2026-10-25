#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *left,*right;
};

struct Node* newNode(int data){
    struct Node* n=(struct Node*)malloc(sizeof(struct Node));
    n->data=data;
    n->left=n->right=NULL;
    return n;
}

int height(struct Node* root){
    if(root==NULL)
        return 0;
    int left=height(root->left);
    int right=height(root->right);
    return(left>right ? left:right)+1;
}

int main(){
    struct Node* root=newNode(1);
    root->left=newNode(2);
    root->right=newNode(3);
    root->left->left=newNode(4);
    printf("Height of tree: %d",height(root));
    printf("\n");
    return 0;
}
