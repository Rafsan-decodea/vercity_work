#include<stdio.h>
#include<stdlib.h>
#include <string.h>
void reverse(int a )
{
   int reverse=0;
   while(a != 0)
    {
        reverse = (reverse * 10) + (a % 10);
        a /= 10;
    }
    printf("\n---------------------\n");
    printf("Reverse = %d", reverse);
    printf("\n----------------------\n");
}
int main(){
    printf("input Number ====>");
    int a ;scanf("%d",&a);reverse(a);


}
