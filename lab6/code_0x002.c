#include<stdio.h>
#include<stdlib.h>

void pattern(int a){
    for (int i=1;i<=a;i++)
    {
        for (int j =1; i>j; j++)
        {
           printf("%d",j);
        }
        printf("\n");
        
    }

}
int main()
{
    int a;
    printf("Enter The Line Number ===>");
    scanf("%d",&a);
    pattern(a);
}