#include<stdio.h>
#include <math.h>

int main()
{
    int arry[] = {80,60,70,30,55,10,36,20,25,28,45,5,2,18,20,9,7,6,22,3};
    int length = sizeof(arry)/sizeof(arry[0]);
    printf("[+] Heap ====>");
    for(int i=0 ; i<=length-1;i++)
    {
        printf("%d ",arry[i]);
    }
    printf("\n");
    printf("[+] Root node is ===> %d \n",arry[0]);
    int child1 = 4*2;
    int child2 = child1+1;
    printf("[+] Child node of %d is ===> %d and  %d\n",arry[2],arry[child1],arry[child2]);
   
    printf("[+] Parent of  Of  %d is ===> %d \n" ,arry[4],arry[4/2]);
    printf("[+] Number of Elements ==> %d \n",length);
    double  hight = log(arry[4]);
    printf("[+] Hight of Tree is ====>  %f",round(hight));


    }