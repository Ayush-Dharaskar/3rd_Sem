#include<stdio.h>

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

int main()
{

    int arr[10],n,ele;
    printf("size:");
    scanf("%d",&n);



    printf("enter arr:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

    selectionSort(arr,n);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }



}
