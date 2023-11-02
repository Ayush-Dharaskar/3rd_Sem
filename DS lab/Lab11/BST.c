#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
    int data;
    struct Node* right;
    struct Node* left;
}Node;

void createBST(Node **root,int d)
{
    Node* newNode =( Node*)malloc(sizeof( Node));
    newNode->data = d;
    newNode->left = NULL;
    newNode->right = NULL;

    Node *temp = *root;
    if(*root == NULL)
    {
        *root = newNode;
        return;
    }

    if(d < temp->data)
    {
        createBST(&(temp->left),d);
    }
    else
        createBST(&(temp->right),d);

}
void inorder(Node *root)
{

    if (root == NULL)
    {
        return;
    }

    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}

void search(Node *root, int key)
{
    if(root == NULL)
    {
        printf("Element not found");
        return;
    }
    if(root->data == key)
    {
        printf("Element found");
        return;
    }

    if(key < root->data)
    {
        search(root->left,key);
    }
    else
    {
        search(root->right,key);
    }
}
int main()
{
    Node* root = NULL;
    createBST(&root,5);
    createBST(&root,6);
    createBST(&root,2);
    createBST(&root,7);
    createBST(&root,3);

    inorder(root);

    search(root,9);
    return 0;
}

