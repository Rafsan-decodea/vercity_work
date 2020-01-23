#include<stdio.h>
/*  Even OOD */
int calulate(int number)
{
    if (number%2==0)
    {
        printf("%d number is even",number);
    }
    else
    {
        printf("%d number is odd",number);
    }
}

int main(){ printf("input a number for check====>");int number ; scanf("%d",&number); calulate(number) ; }
