#include <stdio.h>
#include <stdlib.h>
typedef struct Node{
    struct Node* prev;
    struct Node *next;
    int data;
}Node;

 Node *head =NULL;

 Node* createNode(int d)
{
     Node* newNode = ( Node*)malloc(sizeof( Node));
    newNode->data = d;
    newNode->next = NULL;
    newNode->prev = NULL;
}
void insertend(int a)
{
     Node* ins = createNode(a);
    if(head==NULL)
    {
        head=ins;
    }
    else
    {
         Node* temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=ins;
        ins->prev=temp;
    }
}
void display()
{
    if(head==NULL)
    {
        printf("Nothing to display\n");
    }
    else{
         Node *temp;
        temp=head;
        while(temp!=NULL)
        {
            printf("%d ",temp->data);
            temp=temp->next;
        }
        printf("\n");
    }
}
void delRear()
{
    Node* cur =head;
    Node* prev =head;

    while(cur->next != NULL){
        cur =cur->next;
    }
    cur->prev->next = NULL;
    free(cur);
}
void insertPos(int d,int pos)
{
    Node* ins =createNode(d);
    Node* temp =head;
    for(int i=1;i<pos-1;i++)
    {
        temp =temp->next;
        if(temp == NULL)
        {
            printf("Out of bounds\n");
            return;
        }
    }

    ins->prev = temp;
    temp->next->prev =ins;
    ins->next =temp ->next;
    temp->next =ins;

}
void delPos(int pos)
{
    Node* temp =head;
    for(int i=1;i<pos-1;i++)
    {
        temp =temp->next;
        if(temp == NULL)
        {
            printf("Out of bounds\n");
            return;
        }
    }
    Node* del =temp->next;
    temp->next =del->next;
    del->next->prev = temp;
    free(del);
}
void insertAfterEle(int d,int key)
{
    Node* ins =createNode(d);
    Node* temp =head;

    while(temp->data != key && temp !=NULL)
    {

        temp=temp->next;

    }
    if(temp == NULL)
    {
        printf("Element does not exists\n");
        return;
    }
    ins ->prev = temp;
    ins ->next =temp->next;
    temp->next->prev = ins;
    temp->next =ins;
}
void insertBeforeEle(int d,int key)
{
    Node* ins =createNode(d);
    Node* temp =head;

    while(temp->data != key && temp !=NULL)
    {

        temp=temp->next;

    }
    if(temp == NULL)
    {
        printf("Element does not exists\n");
        return;
    }

    ins ->next = temp;
    ins ->prev =temp->prev;
    temp->prev->next =ins;
    temp->prev =ins;
}
void reverse()
{
    Node* back =NULL;
    Node* cur =head;

    while(cur!=NULL)
    {
        back = cur->prev;
        cur->prev = cur->next;
        cur->next = back;
        cur= cur->prev;
    }
    head = back->prev;
}
int main()
{
    int i,m,p;
    do{
        printf("DLL menu:\n");
        printf("1.Insertion at end\n");
        printf("2.Deletion at end\n");
        printf("3.Insertion at position\n");
        printf("4.Deletion at position\n");
        printf("5.Insertion after an element\n");
        printf("6.Insertion before an element\n");
        printf("7.Reversal\n");
        printf("9.display\n");
        printf("Enter choice:");
        scanf("%d",&i);
        switch(i)
        {
            case 1:
                printf("Enter element:");
                scanf("%d",&m);
                insertend(m);
                break;
            case 2:
                delRear();
                break;
            case 3:
                printf("Enter element and position:");
                scanf("%d %d",&m,&p);
                insertPos(m,p);
                break;
            case 4:
                printf("Enter position to delete:");
                scanf("%d",&p);
                delPos(p);
                break;
            case 5:
                printf("Enter element and key:");
                scanf("%d %d",&m,&p);
                insertAfterEle(m,p);
                break;
            case 6:
                printf("Enter element and key:");
                scanf("%d %d",&m,&p);
                insertBeforeEle(m,p);
                break;
            case 7:
                reverse();
                break;
            case 9:
                display();
                break;

        }
    }while(i!=0);
    return 0;
}
