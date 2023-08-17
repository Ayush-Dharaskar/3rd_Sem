#include<stdio.h>
#include<string.h>
int main()
{
    char str[100],str2[100];
    printf("Enter str:");
    gets(str);
    printf("Enter str to concat:");
    gets(str2);
    int n,m,j=0;

    for(n=0;str[n]!='\0';n++);
    for(m=0;str[m]!='\0';m++);

    for(int i=0;i<m+n;i++)
    {
        if(str[i]=='\0')
        {
           printf("String 2 is bigger 1");
           break;
        }
        else if(str2[i]=='\0')
        {
            printf("String 1 is bigger 2");
            break;
        }
        else if(str[i]>str2[i])
        {
            printf("String 1 is bigger 3");
            break;
        }
        else if(str[i]<str2[i])
        {
            printf("String 2 is bigger 4");
            break;
        }

    }
    int act =strcmp(str,str2);
    printf("\n%d",act);


}
