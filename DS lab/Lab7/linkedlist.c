#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
}Node;

struct Node* createNode(int d)
{
    struct Node* temp = (struct Node*)malloc(sizeof(Node));
    temp -> data= d;
    temp-> next = NULL;
    return temp;

}

struct Node* insertAfter(struct Node* head, int d, int ele)
{
    struct Node* newNode = createNode(d);
    struct Node* temp = head;

    if(head == NULL){
        head = newNode;
        printf("%d\n",head->data);
        return head;
    }

    while(temp != NULL && temp->data != ele){
        temp=temp->next;
    }
    if(temp == NULL){
        printf("Element not present\n");
        return head;
    }
    newNode ->next = temp->next;
    temp->next = newNode;
    return head;
}

struct Node* insertBefore(struct Node* head, int d, int ele)
{
    struct Node* newNode = createNode(d);
    struct Node* temp = head;
    if(head == NULL){
        head = newNode;
        return head;
    }

    if(head->data == ele){
        newNode->next = head;
        return newNode;
    }
    while(temp->next->data != ele){
        temp=temp->next;
    }

    if(temp == NULL){
        printf("Element not present");
        return head;
    }

    newNode ->next = temp->next;
    temp->next = newNode;
    return head;
}

void print(struct Node* head)
{
    struct Node* temp = head;
    while(temp !=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

/*void delet(struct Node* head,int ele)
{
    if(head == NULL){
        printf("List empty\n");
        return;
    }

    struct Node* temp =head;

    while(temp->next!=NULL && temp->next->data != ele){
        temp = temp-> next;
    }
    if(temp == NULL){
        printf("Element not found");
        return;
    }


    struct Node* del = temp->next;
    temp->next = del->next;


    free(del);

}*/

struct Node* delet(struct Node* head, int data) {
    if (head == NULL) {
        printf("Linked list is empty.\n");
        return head;
    }

    struct  Node* current = head;
    struct Node* prev = NULL;

    while (current != NULL && current->data != data) {
        prev = current;
        current = current->next;
    }

    if (current == NULL) {
        printf("Element not found in the linked list.\n");
        return head;
    }

    if (prev == NULL) {
        head = current->next;

    }

    else {
        prev->next = current->next;
    }

     free(current);
     printf("Element deleted successfully.\n");
     return head;

}

struct Node* reverse(struct Node* head)
{
    if(head == NULL){
            printf("Empty list\n");
        return head;
    }
    else if(head->next == NULL)
    {
        printf("Only one element");
        return head;
    }
    struct Node* prev =NULL;
    struct Node* cur = head;
    struct Node* forward = NULL;

    while(cur != NULL)
    {
        forward = cur->next;
        cur ->next = prev;
        prev = cur;
        cur = forward;
    }


    return prev;
}

void sort(struct Node* head)
{

}
int main()
{

    /*struct Node* head =createNode(1);
    insertAfter(head,2,1);
    insertAfter(head,3,2);
    insertBefore(head,69,2);
    print(head);
    delet(head,69);
    head = reverse(head);


    print(head);*/
    struct Node* head =NULL;
    int data,opt,ele;
    while(1)
    {
        printf("0.End\n1.Insert After\n2.Insert Before\n3.Display\n4.Delete Element\n5.Reverse list\n");
        scanf("%d",&opt);
        switch(opt)
        {
        case 0:
            return 0;
        case 1:
            printf("Data:");
            scanf("%d",&data);

            printf("Element:");
            scanf("%d",&ele);
            head=insertAfter(head,data,ele);
            break;
        case 2:
            printf("Data:");
            scanf("%d",&data);
            printf("Element:");
            scanf("%d",&ele);
            head=insertBefore(head,data,ele);
            break;

        case 3:
            print(head);
            break;
        case 4:
            printf("Element to delete:");
            scanf("%d",&ele);
            delet(head, ele);
            break;
        case 5:
            head =reverse(head);
            break;

        }

    }


}
