#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
int a;
printf("input =====>");
scanf("%d",&a);
for(int i=1;i<=a;i++)
{  
    for(int j=1;j<11;j++)
    {
        printf("%d *%d = %d \n",i,j,i*j);
    }  
    printf("\n");
}
}