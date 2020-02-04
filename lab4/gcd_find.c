#include <stdio.h>
#include<stdlib.h>

void find_gcd(int num1 , int num2)
{
     while(num1!=num2)
    {
        if(num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
    }
    printf("The Gcd Is  = %d",num1);
}

int main(int argc , char *argv[])
{
    int num1 =atoi(argv[1]), num2=atoi(argv[2]);
    find_gcd(num1,num2);
}