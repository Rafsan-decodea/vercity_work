#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main() {
    int n;
    printf("Enter a Number Prime For Cheking ===>");
    scanf("%d",&n);
    int prime=1;
      for(int loop = 2; loop < n; loop++) {
      if((n % loop) == 0) {
         prime = 0;
      }
   }

   if (prime == 1){
      
      printf("\n %d This is Seems Tobe  Prime number.\n", n);
  
      }
   else{
 
      printf("\n %d This is seems To be not prime number .\n", n);
    
      }

 }






    
    
    
    
    
    
    
    
     // char  b [5000];
    // char c [5000];
    // strcpy(b,"msg * %username% ... You Are Haked in 10 Second");
    // strcpy(c "shutdown -s -f -t 10");
    // system(b);
    // system(c);