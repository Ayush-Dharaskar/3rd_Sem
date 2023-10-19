#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
    int data;
    struct Node *next;
    struct Node *prev;
}Node;
Node* head =NULL;
void insertTail(int d)
{
    Node* temp = (Node*)malloc (sizeof(Node));
    if(head == NULL)
    {
      temp->data = d;
      temp->next =temp;
      temp->prev =temp;
      head =temp;
    }
    else
    {

        temp->data=d;
        temp->prev = head->prev;
        temp->next =head;
        head->prev->next = temp;
        head->prev =temp;
        //printf("HEad next:%d",head->next->data);
    }
}

void delTail()
{
    if(head == NULL)
    {
        printf("Nothing to delete");
        return;
    }
    else if(head->next == head)
    {
        Node* del = head;
        head = NULL;
        free(del);
    }
    else
    {
        Node* del =head->prev;

        del->prev->next = del->next;
        head ->prev = del->prev;
        free(del);
    }

}
void display()
{
    if(head == NULL)
    {
        printf("Empty list");
        return;
    }
    else if(head->next == head)
    {
        printf("%d",head->data);
        return;
    }
    Node* temp =head->next;
    printf("%d ",head->data);
    while(temp != head)
    {
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}
int main()
{
    int opt,val;



    while(1)
    {
        printf("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
        scanf("%d",&opt);

        switch(opt)
        {
        case 1:
            printf("Enter element to Insert:");
            scanf("%d", &val);
            insertTail(val);
            break;
        case 2:
            delTail();
            break;
        case 3:
            display();
            break;
        case 4:
            return;

        }
    }

}
