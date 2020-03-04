#include<stdio.h>
#include<math.h>
#include<stdlib.h>

void pattern(int a )
{
	for (int x=1; x<=a;x++)
	{
	   for (int j=1 ; j<=x;j++)
	   {
	   	printf("*");
	   }
	   printf("\n");
	}
}
int main()
{
	int row ;
	scanf("%d",&row,printf("Enter Number Of Row===>"));
	pattern(row);
}

