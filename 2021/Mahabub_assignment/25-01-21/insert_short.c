#include<stdio.h>
 

int insert_short(int n)
{
    int i,j,temp,a[30];
    for(i=0;i<n;i++)
    {
        printf("[+]OK ... Now Enter integer for Array Element[%d]",i);
        scanf("%d",&a[i]);
    }
 
    for(i=1;i<=n-1;i++)
    {
        temp=a[i];
        j=i-1;
 
        while((temp<a[j])&&(j>=0))
        {
            a[j+1]=a[j];    //moves element forward
            j=j-1;
        }
 
        a[j+1]=temp;    //insert element in proper place
    }
 
    printf("\n[+] Complate \n-------\n");
    printf("[+]Your Sorted arry is ===>");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
}


int main()
{

    printf("\n -----===insert_short Programm------=======\n");
    printf("[+]Enter How many integer you Want short===>");
    int n;
    scanf("%d",&n);
    insert_short(n);
    
 
}