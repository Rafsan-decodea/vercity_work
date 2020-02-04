#include<stdio.h>
/*  4 no slueotion */

int main()
{
    printf("input a number for check====>");
    int number ; 
    scanf("%d",&number); 
    puts(number > 0 ? "1":"0");
    puts(number < 0? "-1":"none");
    return 0;
 }
