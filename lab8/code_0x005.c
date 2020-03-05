#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void calculate(int x, int y){int sum = pow(y,x);printf("\n-----------\n [+]The Power x in y is===>%d \n",sum);}
int main()
{
	int a,b; 
	printf("Enter x number ===>");scanf("%d",&a);
	printf("Enter y number ==> ");scanf("%d",&b);
	calculate(a,b);
}