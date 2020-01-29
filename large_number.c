#include<stdio.h>
#include<stdlib.h>

int calculate(int a ,int b ,int c , int d)
{
  printf("--------------------------------------------\n");
  if (a>b && a>c && a>d){printf("Grater number is A ==>%d",a);}
  else if(b>a && b>c && b>d){printf("Grater number id B==>%d",b);}
  else if(c>a && c>d && c>b){printf("Grater number is C==>%d",c);}
  else{printf("Grater number is D==>%d",d );}
}

int main(int argc , char *argv[])
{

	int a,b,c,d;
	a = atoi(argv[1]);
	b = atoi(argv[2]);
	c = atoi(argv[3]);
	d =  atoi(argv[4]);
	calculate(a,b,c,d);
}
