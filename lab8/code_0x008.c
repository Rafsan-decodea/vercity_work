#include<stdio.h>
#include<stdlib.h>

void reverse(int a)
{
    int rev = 0;
    while(a!=0)
    {
        rev = (rev*10)+(a%10);a /= 10;
    }
    printf("\n---------------------\n[+] Reverse Number is ====>%d \n",rev);
}

int main()
{ 
    int num; scanf("%d",&num,printf("Enter Number for Reverse==>"));
    reverse(num);

}
