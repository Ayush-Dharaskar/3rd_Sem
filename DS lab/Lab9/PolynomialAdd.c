#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
    int coef;
    int expo;
    struct Node *next;

}Node;

Node* head1 =NULL;
Node* head2 =NULL;
Node* head3 = NULL;

void insert(int c,int e,int opt)
{
    Node *newNode =(Node*)malloc(sizeof(Node));
    newNode->next = NULL;
    newNode->coef = c;
    newNode->expo = e;

    switch(opt)
    {
    case 1:
        if(head1 == NULL)
        {
            head1 =newNode;
        }
        else
        {
            Node* temp =head1;
            while(temp->next != NULL)
            {
                temp= temp->next;
            }

            temp->next =newNode;
        }
        break;
    case 2:
        if(head2 == NULL)
        {
            head2 =newNode;
        }
        else
        {
            Node* temp =head2;
            while(temp->next != NULL)
            {
                temp= temp->next;
            }

            temp->next =newNode;
        }
        break;
    case 3:
        if(head3 == NULL)
        {
            head3 =newNode;
        }
        else
        {
            Node* temp =head3;
            while(temp->next != NULL)
            {
                temp= temp->next;
            }

            temp->next =newNode;
        }
        break;


    }

}

void display(int opt)
{
    switch(opt)
    {
    case 1:
        if(head1 == NULL)
        {
            printf("Empty");
            return;
        }
        else
        {
            Node *temp = head1;
            while(temp != NULL)
            {
                printf("%dX^%d+",temp->coef,temp->expo);
                temp = temp->next;
            }
            printf("\b");
            printf("\n");
            break;

        }
    case 2:
        if(head2 == NULL)
        {
            printf("Empty");
            return;
        }
        else
        {
            Node *temp =head2;
            while(temp!=NULL)
            {
                printf("%dX^%d+",temp->coef,temp->expo);
                temp = temp->next;
            }
            printf("\b");
            printf("\n");

        }
        break;
    case 3:
        if(head3 == NULL)
        {
            printf("Empty");
            return;
        }
        else
        {
            Node *temp =head3;
            while(temp!=NULL)
            {
                printf("%dX^%d+",temp->coef,temp->expo);
                temp = temp->next;
            }
            printf("\b");
            printf("\n");
        }
    }
}
void add()
{
    Node* temp1 = head1;
    Node* temp2 = head2;
    Node* temp3 = head3;
    while(temp1 != NULL)
    {
        temp2=head2;
        while(temp2!=NULL)
        {
            if(temp1->expo == temp2->expo)
            {
                printf("temp1: %d %d\n",temp1->coef,temp1->expo);
                printf("temp2: %d %d\n",temp2->coef,temp2->expo);

                Node* sum = (Node*)malloc(sizeof(Node));
                sum->coef = temp1->coef + temp2->coef;
                sum->expo = temp1->expo;
                sum->next =NULL;
                if(head3 == NULL)
                {
                    head3 = sum;
                    temp3 =head3;
                    break;
                }

                temp3->next =sum;
                temp3 = temp3->next;
            }
            temp2 =temp2->next;
        }
        temp1 = temp1->next;
    }

}

int main()
{
    int opt,co,ex,num;
    insert(4,2,1);
    insert(6,1,1);
    insert(6,0,1);
    display(1);

    insert(1,0,2);
    insert(2,1,2);
    insert(3,2,2);
    display(2);

    add();
    printf("%d %d",head3->next->coef,head3->next->expo);
    printf("display\n");
    display(3);

    /*while(1)
    {
        printf("1.Insert\n2.add\n3.Display Ans\n4.Exit\n");
        scanf("%d",&opt);

        switch(opt)
        {
        case 1:
            printf("Enter coef,power,listnum:");
            scanf("%d%d%d", &co,&ex,&num);
            insert(co,ex,num);
            break;
        case 2:
            add();
            break;
        case 3:
            display(3);
            break;
        case 4:
            return;

        }
    }*/
}
