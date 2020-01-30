#include<stdio.h>
#include<stdlib.h>

int calculate(int a ,int b ,int c , int d)
{
  printf("--------------------------------------------\n");
  switch (a>b && a>c && a>d){case 1:printf("Grater is A==>%d",a);break;}
  switch (b>a && b>c && b>d){case 1:printf("Grater is B==>%d",b);break;}
  switch (c>a && c>d && c>b){case 1:printf("Grater is c===>%d",c);break;}
  switch (d>a && d>b && d>c){case 1:printf("Grater is D===>%d",d);break;}
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
