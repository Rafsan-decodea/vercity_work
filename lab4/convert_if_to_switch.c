#include<stdio.h>

int Switch(int inp)
{ 
    switch (inp)
    {
      case 65 :
         printf("Action Movi fan \n");
         break;
      case 97:
          printf("Action Movi fan \n");
          break;
      case 67:
         printf("Comedy Movi fan");
         break;
      case 99:
         printf ("Comedy Movi fan");
         break;
      case 68:
         printf("Drama Movi fan");
         break;
      case 100:
         printf("Drama Movi fan");
         break;
       default:
          printf("Invalid Choise ");
          break;
      }
}
int main()
{
    int inp;
    printf("input Choise===>");scanf("%s",&inp);
    Switch(inp);
    }