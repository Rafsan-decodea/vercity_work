

/*  Radius  */

#include<stdio.h>
#include<math.h>
 
int calculate(int area)
{
    float PI=3.14,radius,ci;
    radius = sqrt((area / PI));
    printf("\n Radius of a Circle : %f ",radius);
}

int main()
{
    int area;
    printf(" Enter the Area=====> ");
    scanf("%d",&area);
    calculate(area);
}