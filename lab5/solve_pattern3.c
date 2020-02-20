#include<stdio.h>
#include<stdlib.h>

void pattern1(int a ){for(int i=1 ; i<=a ; i++){for(int j=1;j<=i;j++){printf("%d ",j);}
          if (i==4){printf("\n");break;}
          printf("\n");}for(int i=4;i>=1;i--){for(int j=1;j<=i;j++){printf("%d ",j);}printf("\n");}}

void pattern2(int a ){for(int i=1 ; i<=a ; i++){for(int j=1;j<=i;j++){printf("%d ",i); }
            if (i==4){printf("\n");break;}printf("\n");}
            for(int i=a;i>=1;i--){for(int j=1;j<=i;j++){printf("%d ",i);}printf("\n");}}

void pattern3(int a ){for(int i=4 ; i<=a ; i++){for(int j=1;j<=i;j++){printf("%c",i+64);}
             if (i==4){printf("\n");break;}printf("\n");}
             for(int i=4;i>=1;i--){for(int j=1;j<=i;j++){printf("%c",j+64);}printf("\n");}}

void pattern4(int a ){for(int i=1 ; i<=a ; i++){for(int j=1;j<=i;j++){printf("%c",i+64); }
             if (i==4){printf("\n");break;}printf("\n");}
             for(int i=4;i>=1;i--){for(int j=1;j<=i;j++){printf("%c",i+64);}printf("\n");}}
void pattern5(int a ){for(int i=1 ; i<=a ; i++){for(int j=1;j<=i;j++){printf("*");}
             if (i==4){printf("\n");break;}printf("\n");}
             for(int i=4;i>=1;i--){for(int j=1;j<=i;j++){printf("*");}printf("\n");}}

int main ()
{
   int a =4;
   printf("\n");
    printf("==========Pattern 1============\n");
    pattern1(a);
    printf("\n");
    printf("=========Pattern 2==============\n");
    pattern2(a);
    printf("\n");
    // printf("=========Pattern 3==============\n");
    // pattern3(a);
    // printf("\n");
    printf("=========Pattern 4==============\n");
    pattern4(a);
    printf("\n");
    printf("=========Pattern 5==============\n");
    pattern5(a);
    printf("\n");
}