#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a;
    printf("Enter The Row  Number ===>");
    scanf("%d",&a);
  
    for (int i=1;i<=a;i++)
    {
        for (int j =1; i>j; j++)
        {
           printf("*");
        }
        printf("\n");
        
    }

}