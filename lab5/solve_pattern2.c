#include<stdio.h>
#include<stdlib.h>

void pattern1(int a )
{
      for(int i=a;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            printf("%d ",j);
        }
        printf("\n");
    }
}

void pattern2(int a)
{
    for(int i=a;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            printf("%d ",i);
        }
        printf("\n");
    }

}
void pattern3(int a)
{ 
    int count =1;
    for (int i=a; i>=1; i--)
    {
        for (int j=1;j<=i;j++)
        {
            if (count)
            {
                printf("%d",count);
            }
            if(count)
            {printf("%d",count-1);}
        }
        printf("\n");
    }
}

void pattern4(int a)
{
    int count =1;
   for (int i=a; i>=a; --i)
	{
		for(int j=1;j<=i;j++)
		{
		   if(count)
		   {
			  printf("%d ",count);
		   }
	   }
		printf("\n");
	   for(int j=1;j<=i;j++)
		{
		   if(count)
		   {
			  printf("%d ",count-1);
		   }
		}
		printf("\n");
	}
}



int main(int argc , char  *argv[])
{
    int a ;
    a = atoi(argv[1]);
    pattern4(a);
}