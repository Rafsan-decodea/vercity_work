#include<stdio.h>

int calculate(int a ,int b ,int c , int d)
{
  printf("--------------------------------------------");
  if (a>b && a>c && a>d){printf("Grater number is A");}
  else if(b>a && b>c && b>d){printf("Grater number id B");}
  else if(c>a && c>d && c>b){printf("Grater number is C");}
  else{printf("Grater number is D" );}
}

int main()
{

	int a,b,c,d;
	printf("Enter number===>");
	scanf("%d",&a);
	printf("Enter nymber===>");
	scanf("%d",&b);
	printf("Enter a number==>");
	scanf("%d",&c);
	printf("Enter a number===>");
	scanf("%d",&d);
	calculate(a,b,c,d);
}
