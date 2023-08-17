#include<stdio.h>
int main()
{
    char str[100],con[100];
    printf("Enter str:");
    gets(str);
    printf("Enter str to concat:");
    gets(con);
    int i,m,j=0;

    for(i=0;str[i]!='\0';i++);


    for(m=0;str[m]!='\0';m++);

    int n=i;
    for(;i<m+n;i++)
    {
        str[i]=con[j++];
    }
    for(int k=0;k<m+n;k++)
    {
        printf("%c",str[k]);
    }
}
