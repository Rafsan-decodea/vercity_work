#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void area(int a, int b,int c){int area ,s ; s = (a+b+c)/2;
          area = sqrt(s*(s-a)*(s-b)*(s-c));
          printf("-------\n Area is===>%d\n",area);}

int main()
{
    int h,w,t; 
    printf("Enter Hight==>");scanf("%d",&h);
    printf("Enter widht==>");scanf("%d",&w); 
    printf("Enter Pososto==>");scanf("%d",&t); 
    area(h,w,t);
}