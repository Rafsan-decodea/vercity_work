#include <stdio.h>
#include<stdlib.h>


  
int main(int argc , char *argv[])
{
  if (argc==4)
  {
    int a = atoi(argv[1]);int b = atoi(argv[2]);
    int c = atoi(argv[3]);
 
  int sum = a+b+c;

  printf("Sum Number is ====>%d \n",sum);
}

  
  else
  {
     printf("\nUses is :: number1  number2 number3 \n ");
  }
  
} 