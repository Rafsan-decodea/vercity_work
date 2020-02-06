#include <stdio.h>
#include<stdlib.h>
int calculate(int n)
   {
    int i, flag = 0;
     for (int i = 2; i <= n / 2; ++i) {
        // condition for non-prime
        if ( n % i == 0) {
           int  flag = 1;
            break;
        }
    }
    if (n == 1) {
        printf(" 1 is invelide");
    }
    else {
        if (flag == 0)
            printf("%d is a prime number.", n);
        else
            printf("%d is not a prime number.", n);
    }
    return 0;

 }

int main(int argc , char *argv[]) {
  if (argc==1){ 
    int n = atoi(argv[1]);calculate(n);}
  else
  {
      fprintf(stderr,"Uses: %s <num1 diban> ",argv[0]);
  }
  
    }
