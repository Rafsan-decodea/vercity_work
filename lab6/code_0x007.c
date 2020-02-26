#include<stdio.h>
#include<stdlib.h>

void factorial(int n)
{ 
   int  fact = 1;
   if (n < 0)
        printf("Error! Factorial of a negative number doesn't exist.");
    else {
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        printf("Factorial of %d = %d", n, fact);
    }
}

int main()
{
  printf("Enter Number For Factorial==>");
  int a ; scanf("%d",&a);factorial(a);
}