#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>

void pattern1(int a){for (int i=1;i<=a;i++){for (int j = 1; j <= i; j++){printf("%d ",j);}printf("\n");}}

void pattern2(int a){for (int i=1; i<=a; i++){for (int j = 1; j <= i ; j++){printf("%d ",i);}printf("\n");}}

void pattern3(int a){int count =1;for (int i=1; i<=a; i++){for(int j=1;j<=i;j++){if(count){printf("%d ",count);}
		   if(count){printf("%d ",count-1);}}printf("\n");}}

void pattern4(int a){int count =1;for (int i=1; i<=a; i++){for(int j=1;j<=i;j++){if(count){printf("%d ",count);}}printf("\n");
	   for(int j=1;j<=i;j++){if(count){printf("%d ",count-1);}}printf("\n");}}

void pattern5(int a){for(int i=1;i<=a;i++){for(int j=1;j<=i;j++){printf("%c",(char)(j+64));}printf("\n");}}

void pattern6(int a){for(int i=1;i<=a;i++){for(int j=1;j<=i;j++){printf("%c",(char)(i+64));}printf("\n");}}

void pattern7(int a){for (int i=1;i<=a;i++){for (int j = 1; j <= i; j++){printf("* ");}printf("\n");}}

int main()
{
	int a;
	printf("input Line Number====>");
    scanf("%d",&a);
    printf("\n");
    printf("==========Pattern 1============\n");
    pattern1(a);
    printf("\n");
    printf("=========Pattern 2==============\n");
    pattern2(a);
    printf("\n");
    printf("=========Pattern 3==============\n");
    pattern3(a);
    printf("\n");
    printf("=========Pattern 4==============\n");
    pattern4(a);
    printf("\n");
    printf("=========Pattern 5==============\n");
    pattern5(a);
    printf("\n");
    printf("=========Pattern 6==============\n");
    pattern6(a);
    printf("\n");
    printf("=========Pattern 7==============\n");
    pattern7(a);
    printf("\n");
}
