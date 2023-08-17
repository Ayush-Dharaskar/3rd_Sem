#include<stdio.h>
#include<string.h>
int main()
{
    char str[100]="Hello world";
    char str2[100]="Program ";
    char result[100];
    int ind=6;
    /*printf("Enter str:");
    gets(str);
    printf("Insert:");
    gets(str2);
    printf("Index:");
    scanf("%d",&ind)*/;
    int n,m,j=0;


    n=strlen(str);
    m=strlen(str2);


    for(int i=0;i<ind;i++)
    {
        result[i]=str[i];

    }

    for(int i=0;i<m;i++)
    {
        result[ind+i]=str2[i];

    }




    for(int i=0;i<n-ind;i++)
    {
        result[ind+m+i]=str[ind+i];

    }

    /*for( i=n;i>=ind;i--);
    {
        str[i+m]=str[i];
    }

    for(i=ind;i<m;i++)
    {
        str[i]=str2[j++];
    }*/

    for(int k=0;k<m+n;k++)
    {
        printf("%c",result[k]);
    }
    //printf("%s",result);


}
