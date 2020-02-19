#include <stdio.h>
#include<stdlib.h>


void result(int a, int b, int c)
{
  int sum = a+b+c;
  printf("-------------------------------\n");
  printf("Sum Number is ====>%d",sum);
}

int main(int argc , char *argv[])
{
  if (argc==4)
  {
    int a = atoi(argv[1]);int b = atoi(argv[2]);
    int c = atoi(argv[3]);
    result(a,b,c);

  }
  else
  {
     printf("Uses is :: number1  number2 number3  ");
  }
  
}