#include<stdio.h>
#include<stdlib.h>
#include <string.h>

int main(){
    printf("input Number ====>");
    int a ;scanf("%d",&a);
    int reverse=0;
   while(a!=0)
    {
        reverse = (reverse * 10) + (a % 10);
        printf("%d\n",reverse);
        a /= 10;
    }
    
    printf("Reverse number is  = %d", reverse);



}
