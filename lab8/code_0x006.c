#include<stdio.h>
#include<math.h>

int toSecond(int hours, int minute , int second)
{
     
     int sum = (hours*3600*3600)+(minute*3600)+second;
     return sum;
}

int main()
{
	int hours,minute,second; 
	scanf("%d",&hours,printf("[+]Enter The Hours===>"));
	scanf("%d",&minute,printf("[+]Enter The Minute===>"));
	scanf("%d",&second,printf("[+]Enter The Second===>"));
	int sum= toSecond(hours,minute,second);
	printf("\n-------------------------------------------\n");
	printf("[#]Result Is ===>%d \n",sum);


}