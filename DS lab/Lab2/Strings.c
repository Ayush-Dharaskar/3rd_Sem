#include<stdio.h>
#include<string.h>
int length (char str[]){
    int n;
    for(n=0;str[n]!='\0';n++);
    return n;
}

void concat(char str[]){
    char con[100];
    printf("Enter str to concat:");
    gets(con);
    int i,j=0;

    int n = length(str);
    int m = length(con);


    

    i=n;
    for(;i<m+n;i++)
    {
        str[i]=con[j++];
    }
    for(int k=0;k<m+n;k++)
    {
        printf("%c",str[k]);
    }
}

int strcomp(char a[20],char b[20])
{
    int i,j;
    for(i=0,j=0;i<length(a) || j<length(b);i++,j++)
    {
        if(a[i]!=b[j])
        {
            return a[i]-b[j];
        }
    }
    return 0;
}

void insersub(char str[],char str2[],int ind){
    

    int n,m,j=0;

    char result[100];
    
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



    for(int k=0;k<m+n;k++)
    {
        printf("%c",result[k]);
    }



}

void delete(char str[],char del[]){
    int l1= length(str);
    int l2 = length(del);
    char *pos=strstr(str,del);
    if(pos!=NULL)
    {
        for(int i=0;i<l1;i++)
        {
            *pos=*(pos+l2);
            *pos++;
        }
    }
    for(int i=0;i<l1-l2;i++)
    {
        printf("%c",str[i]);
    }
}
int main()
{
    char str[100],str2[100], trash[100];
    printf("Enter str:");
    gets(str);

    int opt;
    printf("a.) length of the string\nb.) string concatenation\nc.) string comparison\nd.) to insert a sub string\ne.) to delete a substring\n    ")    ;
    scanf("%d",&opt);
    switch(opt){
        case 1:
        printf("%d",length(str));
        break;

        case 2:
        gets(trash);
        concat(str);
        break;

        case 3:
        gets(trash);
        printf("String 2:");
        gets(str2);
        strcomp(str,str2);
        break;

        case 4:
        gets(trash);
        printf("Substring:");
        gets(str2);
        printf("index: ");
        int index;
        scanf("%d",&index);
        insersub(str,str2,index);
        break;

        case 5:
        gets(trash);
        printf("Del:");
        gets(str2);
        delete(str,str2);
    }

   
    
}