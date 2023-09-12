#include<stdio.h>

void bubbleSort(int arr[],int n)
{
    for (int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

void selectionSort(int arr[],int n)
{
    int min,pos;

    for(int i=0;i<n-1;i++)
    {
        int min =arr[i];
        pos=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<min)
            {
                min=arr[j];
                pos=j;
            }
        }

        arr[pos]=arr[i];
        arr[i]=min;


    }
}

void insertionSort(int arr[],int n)
{
    for(int i=1;i<n;i++)
    {
        int temp=arr[i];
        int j=i-1;
        for(;j>=0;j--)
        {
            if(arr[j]>temp)
            {
                arr[j+1]=arr[j];
            }
            else
            {
                break;
            }
        }
        arr[j+1]=temp;
    }
}
int main()
{

    int arr[10],n,ele,opt;
    printf("size:");
    scanf("%d",&n);



    printf("enter arr:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

    printf("1. Bubble sort\n2. Selection Sort\n3. Insertion Sort\n");
    scanf("%d",&opt);

    switch(opt){
        case 1:
        bubbleSort(arr,n);
        break;

        case 2:
        selectionSort(arr,n);
        break;

        case 3:
        insertionSort(arr,n);
        
    }
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }



}