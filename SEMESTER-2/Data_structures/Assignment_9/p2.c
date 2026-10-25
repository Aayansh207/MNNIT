#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *left,*right;
};

struct Node* createNode(int data){
    struct Node* n=(struct Node*)malloc(sizeof(struct Node));
    n->data=data;
    n->left=n->right=NULL;
    return n;
}

struct Node* insert(struct Node* root,int data){
    if(!root) return createNode(data);
    if(data<root->data)
        root->left=insert(root->left,data);
    else if (data>root->data)
        root->right=insert(root->right,data);
    return root;
}

int search(struct Node* root,int key){
    if(!root) return 0;
    if(root->data==key) return 1;
    if(key<root->data)
        return search(root->left,key);
    else
        return search(root->right,key);
}
struct Node* findMin(struct Node* root){
    while(root->left)
        root=root->left;
    return root;
}

struct Node* deleteNode(struct Node* root, int key) {
    if(!root) return NULL;
    if(key<root->data)
        root->left=deleteNode(root->left,key);
    else if(key>root->data)
        root->right=deleteNode(root->right,key);
    else{
        if(!root->left){
            struct Node* temp=root->right;
            free(root);
            return temp;
        }
        else if(!root->right){
            struct Node* temp=root->left;
            free(root);
            return temp;
        }
        struct Node* temp=findMin(root->right);
        root->data=temp->data;
        root->right=deleteNode(root->right,temp->data);
    }
    return root;
}

void inorder(struct Node* root){
    if(root){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

int main(){
    struct Node* root=NULL;
    root=insert(root,50);
    insert(root,30);
    insert(root,70);
    insert(root,20);
    insert(root,40);
    printf("Tree: ");
    inorder(root);
    printf("\nSearch 40: %d",search(root, 40));
    root=deleteNode(root,30);
    printf("\nAfter deletion: ");
    inorder(root);
    printf("\n");
    return 0;
}
