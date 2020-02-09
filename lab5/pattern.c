#include<stdio.h>
#include<ctype.h>
#include<stdlib.h>

void pattern1(int a)
 {
 	for (int i=1;i<=a;i++)
 	{
 		for (int j = 1; j <= i; j++)
 		{
 			printf("%d ",j);
 		}
 		printf("\n");
 	}
 }


void pattern2(int a)
{
	for (int i=1; i<=a; i++)
	{
		for (int j = 1; j <= i ; j++)
		{
			printf("%d ",i);
		}
		printf("\n");
	}
}



void pattern3(int a)
{
	int num =1;
	int count =1;
   for (int i=1; i<=a; i++)
	{
		for(int j=1;j<=num;j++)
		{
			printf("%d",count%2 );
			count++;
		}
		num+=2;
		printf("\n");
	}

		
}




void pattern5(int a)
{
	int alphabet;
	for (int i=1; i<=(a-'A'+1); ++i) {
        for (int j=1; j<=i; ++j)
        { printf("%c", alphabet); }
        ++alphabet;
        printf("\n");
    }
}


int main(int argc , char *argv[])
{
	int a;
	a = atoi(argv[1]);
    // printf("#pettern 1----------\n");
    // pattern1(a);
    // printf("\n");
    // printf("#pattern 2----------\n");
    // pattern2(a);
    // printf("\n");
    pattern3(a);
}