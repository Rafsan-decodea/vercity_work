#include<stdio.h>
#include<ctype.h>


int justis(char c)
{
    int lowercase = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    int uppercase = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    switch (uppercase||lowercase)
    {
    case 1:
        printf("This is a Vowel");
        break;
    default:
       printf("This is Consonent");
       break;
    }
    switch (isdigit())
    {
    case /* constant-expression */:
        /* code */
        break;
    
    default:
        break;
    }
}


int main()
{
    int upper,lower;
    char c;
    scanf("%c",&c);
    justis(c);
    main();

 }


