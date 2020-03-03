#include <stdio.h>

int swap(int x,int y)
 {
     printf("\n---------------------------------------------------------------\n");
      printf("[+]Before Swapping\n [*]First integer = %d\n [*]Second integer = %d\n", x, y);
      printf("\n-------\n");
     int  t = x; x = y; y = t;
      printf("[+]After Swapping\n [*]First integer = %d\n [*]Second integer = %d\n", x, y);
 }
int main()
{
  int a, b;
 printf("Enter num 1==>");scanf("%d",&a);
 printf("Enter num 2==>");scanf("%d",&b);
 swap(a,b);

}
