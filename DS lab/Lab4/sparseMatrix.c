#include<stdio.h>
#define SIZE 10

int front = -1;
int rear = -1;

struct Queue
{
    int row;
    int col;
    int ele;

}queue[SIZE];

void enqueue(int row, int col,int ele)
{
    if(rear == SIZE-1)
    {
        printf("Queue overflow");
        return;
    }
    else if(front==-1)
    {
        rear = front = 0;
        queue[rear].row = row;
        queue[rear].col = col;
        queue[rear].ele=ele;

    }
    else
    {
        rear ++;
        queue[rear].row = row;
        queue[rear].col = col;

        queue[rear].ele = ele;


    }

}

void display()
{
    printf("Index\tElement\n");
    for(int i=front;i<=rear;i++)
    {
        printf("(%d,%d)   %d\n",queue[i].row,queue[i].col,queue[i].ele);
    }
}

int main()
{
    int m=3,n=3,temp;
    printf("Enter order:");
    scanf("%d %d",&m,&n);

    int arr[m][n];
    printf("Enter elements:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    //trnspose
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(i<j)
            {
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
    }

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(arr[i][j]!=0)
            {

                enqueue(i,j,arr[i][j]);
            }
        }
    }

    display();

}
