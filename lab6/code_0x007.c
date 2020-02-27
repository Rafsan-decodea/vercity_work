#include<stdio.h>
#include<stdlib.h>

void factorial(int n)
{ 
   int  fact = 1;
   if (n < 0){
        printf("\n-----------------------------\n");
        printf("Error! Factorial of a negative number doesn't exist.");
        printf("\n-----------------------------\n");
   }
    else {
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        printf("\n-----------------------------\n");
        printf("Factorial of %d = %d", n, fact);
        printf("\n-----------------------------\n");
    }
}

int main()
{
  printf("\nEnter Number For Factorial==>");
  int a ; scanf("%d",&a);factorial(a);
}