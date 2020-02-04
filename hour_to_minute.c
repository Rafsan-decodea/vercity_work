
/*  Hour To munite */
#include<stdio.h>
#include<stdlib.h>
int calculate(int hour , int minute)
{
   int result = (hour*3600)+minute;
   printf("Minute is ===>%d",result);
}

int main(int argc , char *argv[])
{
    int hour, minute;
    hour = atoi(argv[1]);
    minute = atoi(argv[2]);
    calculate(hour,minute);
}