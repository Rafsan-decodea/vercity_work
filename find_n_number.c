#include<stdio.h>
#include<stdlib.h>

void loop(int a )
{
   for (int i=0;i<=a;i++)
   {
       printf("+ %d  ",i);
   }
}

int main()
{
    int a ; 
    printf("Enter a number for Loop ===>");
    scanf("%d",&a);
    loop(a);
}