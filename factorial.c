#include<stdio.h>

void factorial(int n)
{
    unsigned long long fact = 1;
    if (n < 0)
        printf("Error! Factorial of a negative number doesn't exist.");
    else {
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        printf("Factorial of %d = %llu", n, fact);
    }
}


int main() {
    int n;
    printf("Enter an integer Number ===>: ");
    scanf("%d", &n);
    factorial(n);
    return 0;
}