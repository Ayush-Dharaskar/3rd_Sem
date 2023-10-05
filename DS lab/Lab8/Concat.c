#include <stdio.h>
#include <stdlib.h>
typedef struct{
    struct Node* prev;
    struct Node *next;
    int data;
}Node;

 Node *head1 = NULL;
 Node *head2 = NULL;

Node* createNode(int d)
{
     Node* newNode = ( Node*)malloc(sizeof( Node));
    newNode->data = d;
    newNode->next = NULL;
    newNode->prev = NULL;
}
void concat()
{
    Node* temp =head1;
    while(temp->next != NULL)
    {
        temp=temp->next;
    }
    temp->next =head2;
}
void insertend(int a,int ch)
{
    if(ch==1)
    {
        Node* ins = createNode(a);
        if(head1==NULL)
        {
            head1=ins;
        }
        else
        {
            Node* temp=head1;
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=ins;
            ins->prev=temp;
        }
    }
    else if(ch==2)
    {
        Node* ins = createNode(a);
        if(head2==NULL)
        {
            head2=ins;
        }
        else
        {
            Node* temp=head2;
            while(temp->next!=NULL)
            {
                temp=temp->next;
            }
            temp->next=ins;
            ins->prev=temp;
        }
    }
}

void display(int ch)
{
    if(ch ==1)
    {
        if(head1==NULL)
        {
            printf("Nothing to display\n");
        }
        else{
             Node *temp;
            temp=head1;
            while(temp!=NULL)
            {
                printf("%d ",temp->data);
                temp=temp->next;
            }
            printf("\n");
        }
    }
    else if(ch==2)
    {
        if(head2==NULL)
        {
            printf("Nothing to display\n");
        }
        else{
             Node *temp;
            temp=head2;
            while(temp!=NULL)
            {
                printf("%d ",temp->data);
                temp=temp->next;
            }
            printf("\n");
        }
    }
}

int main()
{
        int i,m,n;
    do{
        printf("1.Insert\n2.concat\n3.display\n4.exit\n");
        scanf("%d",&i);
        switch(i)
        {
            case 1:
                printf("Enter value and list number:");
                scanf("%d %d",&m,&n);
                insertend(m,n);
                break;
            case 2:
                concat();
                break;
            case 3:
                printf("Enter linked list number to display");
                scanf("%d",&m);
                display(m);
                break;
            case 4:
                exit(0);
                break;
        }
    }while(1);
    return 0;
}



