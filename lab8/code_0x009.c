#include <stdio.h>  
#include <string.h>  
void DecimalToBinary(int decimal)
{
    long tempDecimal = decimal;  
    char binary[65]; int index=0;
    while(tempDecimal!=0)  
    {  
        binary[index] = (tempDecimal % 2) + '0';  

        tempDecimal /= 2;  
        index++;  
    }  
    binary[index] = '\0';  

    strrev(binary);  
    printf("\n-----------------------------------\n");
    printf("\nDecimal value = %ld\n", decimal);  
    printf("Binary value of decimal = %s \n", binary);  

}
void BinaryToDecimal(int )
{

    
}

int main()  
{  
   int select;
   printf("\n-----------------\n[+]1) Convert Decimal To Binary \n[+]2) Convert Binary To Decimal\n ------------------------------ \n");
   scanf("%d",&select,printf("Enter Your Choise===>"));
   if (select ==1){
           long decimal ;
           scanf("%ld", &decimal,printf("Enter any decimal value ====>: "));  
           DecimalToBinary(decimal);}
   if (select == 2)
   {
   }
    
    
} 