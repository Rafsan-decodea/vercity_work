
/*  Hour To munite */

#include<stdio.h>

int calculate(int hour , int minute)
{
   int result = (hour*3600)+minute;
   printf("Minute is ===>%d",result);
}

int main()
{
    int hour, minute;
    printf("Enter hour===>");
    scanf("%d",&hour);
    printf("Enter Minute==>");
    scanf("%d",&minute);
    calculate(hour,minute);
}