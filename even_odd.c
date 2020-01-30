#include<stdio.h>
/*  Even OOD */
int calulate(int number){puts(number%2==0?"EVEN":"ODD");}
int main(){ int number ; printf("input a number for check====>"); scanf("%d",&number); calulate(number) ; }
