#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>


int justis(char c)
{
    int lowercase = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    int uppercase = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    switch (uppercase||lowercase)
    {
    case 1:
        printf("This is a Vowel\n");
        break;
    default:
       printf("This is Consonent\n");
       break;
    }
    switch (isdigit(c))
    {
    case 1:
       printf("This is a Degit\n");
       break;
    default:      
       break;
    }
    switch (isalpha(c))
    {
    case 1:
      printf("This is a Alphabet");
        
       break;
    
    default:
        break;
    }

}


int main()
{
    int upper,lower;
    char c;
    printf("Enter=====>");
    scanf("%c",&c);
    justis(c);
    // if L Press  Program Will Break
    if (c=='L')
       {system("exit");}
    else
        {main();}
       
    
    
   

 }


