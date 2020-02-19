#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void palidrome(int n)
{
    int reverse = 0, orginal; 
    orginal = n;
   while(n != 0)
    {
        reverse = (reverse * 10) + (n % 10);
        n /= 10;
    }
    if (orginal ==  reverse)
        printf("%d is a palindrome.", orginal);
    else
        printf("%d is not a palindrome.", orginal);
}
int main()
{
    int n;
  printf("Enter an integer===>: ");
  scanf("%d", &n);
  palidrome(n);
}