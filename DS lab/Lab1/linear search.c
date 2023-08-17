#include<stdio.h>

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

    printf("Element:");
    scanf("%d",&ele);

    for(int i=0;i<n;i++)
    {
        if(ele==arr[i])
        {
            printf("Found at position %d",i+1);
            return 0;
        }
    }

    printf("Not found");
}
