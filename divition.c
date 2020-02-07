#include<stdio.h>
#include<stdlib.h>

void result(int number)
{
    switch(number==100 && number>=80){case 1: printf("----\nYou Get A+ Number is %d\n---",number); break;}
    switch(number>60  && number<=80){case 1: printf("---\nYou Get A Number is %d\n---",number);break;}
    switch(number>50  && number<=60){case 1:printf("---\nYou Get A- Number is %d\n---",number);break;}
    switch(number>40  && number<=50){case 1:printf("---\nYou Get B Number is %d---",number);break;}
    switch(number>=33  && number<=40){case 1:printf("-----\nYou Get c Number is %d\n----",number);break;}
    switch(number<33){case 1:printf("----\nFalil Number is  %d \n---",number);break;}
    printf("---\n Ctrl+c To Stop Program--\n");
   
}


int main()
{
  int number;
  printf("\n Enter a Number===>");
  scanf("%d",&number);
  result(number);
  
  main();

}