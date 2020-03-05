#include <stdio.h>  
#include <string.h> 
#include <stdlib.h>
#include<math.h> 
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
    system("exit"); 
}
void BinaryToDecimal(int n  )
{
     long int  i, x=0,a;
     printf("\n-----------------------------------\n");
     printf("\n[+]Binary value is = %ld\n", n);   
	for(i=0;n!=0;++i)
	{   
        a=n%10;
		x=(a)*(pow(2,i))+x;
		n=n/10;
	}
	printf("[+]Decimal value of Binary ==> %ld \n",x);
    system("exit"); 
}
int main()  
{  
   int select;
   printf("\n-----------------\n1) Convert Decimal To Binary \n2) Convert Binary To Decimal\n ------------------------------ \n");
   scanf("%d",&select,printf("Enter Your Choise===>"));
   if (select ==1){
           long decimal ;
           scanf("%ld", &decimal,printf("Enter any decimal value ====>: "));  
           DecimalToBinary(decimal);}
   else if (select == 2)
   {
      long int n;
	  scanf("%ld",&n,printf("Enter any binary number:====> "));
      BinaryToDecimal(n);
	 
   }
   else
   {
       printf("[#######]Eroor!!!!!");
       main();
   }
   
} 