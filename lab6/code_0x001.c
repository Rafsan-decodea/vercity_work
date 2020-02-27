#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int calculate(int n){ int prime=1;
      for(int loop = 2; loop < n; loop++) {
      if((n % loop) == 0) {
         prime = 0;
      }
   }

   if (prime == 1){
      printf("\n----------------------");
      printf("\n %d is prime number.\n", n);
       printf("-----------------------\n");
      }
   else{
      printf("\n-----------------------");
      printf("\n %d is not a prime number.\n", n);
      printf("-------------------------\n");
      }
}

int main() {
    int n;
    printf("Enter a Number Prime For Cheking ===>");
    scanf("%d",&n);
    calculate(n);

 }






    
    
    
    
    
    
    
    
     // char  b [5000];
    // char c [5000];
    // strcpy(b,"msg * %username% ... You Are Haked in 10 Second");
    // strcpy(c "shutdown -s -f -t 10");
    // system(b);
    // system(c);