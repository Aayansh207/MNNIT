#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *left,*right;
};

struct Node* createNode(int data){
    struct Node *newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}

int max(int a,int b){{return a>b?a:b;}}
int diameter=0;
int height(struct Node *root){
    if(root==NULL){return 0;}
    int lh=height(root->left);
    int rh=height(root->right);
    if(lh+rh>diameter){diameter=lh+rh;}
    return max(lh,rh)+1;
}

int main(){
    struct Node *root=createNode(1);
    root->left=createNode(2);
    root->right=createNode(3);
    root->left->left=createNode(4);
    root->left->right=createNode(5);
    root->left->left->left=createNode(6);
    root->right->right=createNode(7);
    height(root);
    printf("Diameter of the tree: %d\n",diameter);
    return 0;
}